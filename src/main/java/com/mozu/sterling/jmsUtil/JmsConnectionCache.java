package com.mozu.sterling.jmsUtil;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.Destination;
import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.mozu.sterling.handler.ConfigHandler;
import com.mozu.sterling.model.Setting;
import com.mozu.sterling.service.NewSterlingToMozuOrderMessageListener;

/**
 * A simple concurrent hash map keeps track of jms resources per tenant.
 *
 */
@Component
public class JmsConnectionCache {
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ConfigHandler configHandler;

	@Autowired
	@Qualifier("directJmsStrategy")
	private JmsConnectionStrategy directConnectionStrategy;

	private ConcurrentHashMap<Integer, JmsResource> jmsResourceMap;

	public JmsTemplate getTemplate(Integer tenantId) throws Exception {
		JmsResource resource = getResource(tenantId);

		if (resource != null) {
			return resource.getJmsTemplate();
		} else {
			throw new RuntimeException("No jms settings configured for tenant "
					+ tenantId);
		}
	}

	public Destination getInboundDestination(Integer tenantId) throws Exception {
		JmsResource resource = getResource(tenantId);

		if (resource != null) {
			return resource.getReadDestination();
		} else {
			throw new RuntimeException("No jms settings configured for tenant "
					+ tenantId);
		}
	}

	/**
	 *
	 * @param tenantId
	 * @param listener
	 * @return True if the listener is on, otherwise false.
	 */
	public boolean toggleListener(Integer tenantId) throws Exception {
		JmsResource resource = getResource(tenantId);

		if (resource != null) {
			if (resource.isListening()) {
				resource.stopListening();
			} else {
				resource.startListening();
			}
		}

		return resource.isListening();
	}

	@PostConstruct
	public void postConstruct() {
		jmsResourceMap = new ConcurrentHashMap<Integer, JmsResource>();
	}

	@PreDestroy
	public void preDestroy() {
		for (JmsResource resource : jmsResourceMap.values()) {
			resource.close();
		}
	}

	protected JmsResource getResource(Integer tenantId) throws Exception {
		JmsResource resource = jmsResourceMap.get(tenantId);

		if (resource == null) {
			Setting setting = configHandler.getSetting(tenantId);
			resource = jmsResourceMap.putIfAbsent(tenantId,
					createResource(tenantId, setting));
		}

		return resource;
	}

	protected JmsResource createResource(Integer tenantId, Setting setting)
			throws JMSException {
		JmsConnectionStrategyEnum connectionStrategyType = JmsConnectionStrategyEnum
				.from(setting.getConnectionStrategy());
		JmsResource jmsResource = null;
		NewSterlingToMozuOrderMessageListener listener = applicationContext
				.getBean(NewSterlingToMozuOrderMessageListener.class);
		listener.setTenantId(tenantId);

		switch (connectionStrategyType) {
		case DIRECT:

			jmsResource = new JmsResource(
					directConnectionStrategy.getConnectionFactory(setting),
					directConnectionStrategy.getOutboundDestination(setting),
					directConnectionStrategy.getInboundDestination(setting),
					listener, DestinationTypeEnum.from(setting
							.getDestinationType()));
			break;
		case WEBSPHEREMQ:
			// TODO needs implementation
			break;
		case JNDI:
			// TODO needs implementation
			break;
		}

		return jmsResource;
	}
}