package com.mozu.sterling.service;

import java.io.StringReader;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.mozu.api.MozuApiContext;
import com.mozu.sterling.handler.ConfigHandler;
import com.mozu.sterling.model.Setting;

/**
 * Receives jms messages for processing. Not thread safe as it is tied to a
 * tenant.
 *
 */
public class NewSterlingToMozuOrderMessageListener implements MessageListener {
	private static final Logger logger = LoggerFactory
			.getLogger(NewSterlingToMozuOrderMessageListener.class);
	private static JAXBContext jaxbContext = null;

	private Integer tenantId;

	private Integer siteId;

	private OrderService orderService;

	private ConfigHandler configHandler;

	static {
		try {
			jaxbContext = JAXBContext
					.newInstance(com.mozu.sterling.model.order.Order.class);
		} catch (JAXBException jaxbEx) {
			logger.error("Error getting jaxb context.");
		}
	}

	public NewSterlingToMozuOrderMessageListener(Integer tenantId,
			Integer siteId, ConfigHandler configHandler,
			OrderService orderService) {
		this.tenantId = tenantId;
		this.siteId = siteId;
		this.configHandler = configHandler;
		this.orderService = orderService;
	}

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				Setting setting = configHandler.getSetting(tenantId);

				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

				DocumentBuilderFactory factory = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder builder;
				Document document = null;
				builder = factory.newDocumentBuilder();
				document = builder.parse(new InputSource(new StringReader(
						((TextMessage) message).getText())));
				com.mozu.sterling.model.order.Order sterlingOrder = (com.mozu.sterling.model.order.Order) unmarshaller
						.unmarshal(document);
				logger.debug("Reading order from the message queue.  Sterling Order No: "
						+ sterlingOrder.getOrderNo());

				if (setting.getSiteMap() != null
						&& !setting.getSiteMap().isEmpty()
						&& setting.getSiteMap().containsValue(
								sterlingOrder.getSellerOrganizationCode())) {

					orderService.importSterlingOrder(new MozuApiContext(
							tenantId, siteId), setting, sterlingOrder);
				} else {
					logger.warn(
							"Mozu site not found for sterling order {} and seller organization {}",
							sterlingOrder.getOrderNo(),
							sterlingOrder.getSellerOrganizationCode());
				}

			} catch (JMSException e) {
				logger.error("Failed to read message.", e);
			} catch (JAXBException jaxbEx) {
				logger.error("Failed to unmarshall.", jaxbEx);
			} catch (Exception mozuEx) {
				logger.error("Failed to complete mozu call.", mozuEx);
			}
		} else {
			logger.info("I don't know what kind of jms message this is.");
			logger.info(message.getClass().getName());
		}
	}
}
