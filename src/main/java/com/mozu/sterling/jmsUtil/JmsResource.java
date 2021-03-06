package com.mozu.sterling.jmsUtil;

import java.util.ArrayList;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;


/**
 * Contains jms types needed to read and write to a single location.
 *
 */
public class JmsResource {
	private static final Logger logger = LoggerFactory
			.getLogger(JmsResource.class);

	private JmsTemplate jmsTemplate;
	private ConnectionFactory connectionFactory;
	private Destination createOrderDestination;
	private Destination updateOrderDestination;
	private Destination inventoryDestination;
	private Destination shipmentDestination;
	

	private List<RestartableMessageListenerContainer> messageListenerContainers;

	public JmsResource(JmsResourceSetting setting) {
		jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(setting.getConnectionFactory());
		jmsTemplate.setDefaultDestination(setting.getCreateOrderDestination());

		this.connectionFactory = setting.getConnectionFactory();
		this.createOrderDestination = setting.getCreateOrderDestination();
		this.updateOrderDestination = setting.getUpdateOrderDestination();
		this.inventoryDestination = setting.getInventoryDestination();
		this.shipmentDestination = setting.getShipmentDestination();

		messageListenerContainers = new ArrayList<RestartableMessageListenerContainer>();

		if (createOrderDestination != null) {
			messageListenerContainers.add(setupListener(
					setting.getCreateOrderMessageListener(),
					createOrderDestination, setting.getDestinationType()));
		}

		if (updateOrderDestination != null) {
			messageListenerContainers.add(setupListener(
					setting.getUpdateOrderMessageListener(),
					updateOrderDestination, setting.getDestinationType()));
		}

		if (inventoryDestination != null) {
			messageListenerContainers.add(setupListener(
					setting.getInventoryMessageListener(),
					inventoryDestination, setting.getDestinationType()));
		}
		if (shipmentDestination != null) {
			messageListenerContainers.add(setupListener(
					setting.getOrderShipmentMessageListener(),
					shipmentDestination, setting.getDestinationType()));
		}
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public Destination getCreateOrderDestination() {
		return createOrderDestination;
	}

	public Destination getUpdateOrderDestination() {
		return updateOrderDestination;
	}

	public Destination getInventoryDestination() {
		return inventoryDestination;
	}
	
	public Destination getShipmentDestination() {
		return shipmentDestination;
	}

	public void startListening() {
		for (RestartableMessageListenerContainer container : messageListenerContainers) {
			if (!container.isRunning()) {
				container.start();
			} else if (container.isNeedsRestart()) {
				container.stop();
				try {
					Thread.sleep(2000);
					container.start();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}

		logger.info("JMS message listener containers started!");
	}

	public void stopListening() {
		for (DefaultMessageListenerContainer container : messageListenerContainers) {
			if (container.isActive()) {
				container.shutdown();
			}
		}

		logger.info("JMS message listener containers stopped!");
	}

	public boolean isListening() {
		boolean isListening = false;
		
		for (RestartableMessageListenerContainer container : messageListenerContainers) {
			isListening &= container != null && container.isRunning() && !container.isNeedsRestart();
		}
		return isListening;
	}
	
	public boolean isAnyListening() {
		boolean isListening = false;
		
		for (RestartableMessageListenerContainer container : messageListenerContainers) {
			isListening |= container != null && container.isRunning() && !container.isNeedsRestart();
		}
		return isListening;
	}

	public void addSite(Integer siteId) {
		for (DefaultMessageListenerContainer container : messageListenerContainers) {
			((TenantSiteMessageListener)container.getMessageListener()).addToSites(siteId);
		}
	}

	public void close() {
		for (DefaultMessageListenerContainer container : messageListenerContainers) {
			if (container != null) {
				container.shutdown();
			}
		}

		// Interfaces don't expose explicit release of connections.
		jmsTemplate = null;
		connectionFactory = null;
		createOrderDestination = null;
		updateOrderDestination = null;
	}

	protected RestartableMessageListenerContainer setupListener(
			MessageListener listener, Destination destination,
			DestinationTypeEnum destinationType) {
		RestartableMessageListenerContainer listenerContainer = new RestartableMessageListenerContainer();
		listenerContainer.setConnectionFactory(connectionFactory);
		listenerContainer.setDestination(destination);
		listenerContainer
				.setPubSubDomain(destinationType == DestinationTypeEnum.TOPIC);
		listenerContainer.setAutoStartup(false);

		// topic consumers will be durable subscribers
		if (destinationType == DestinationTypeEnum.TOPIC) {
			listenerContainer.setSubscriptionDurable(true);
		}

		listenerContainer.setMessageListener(listener);
		listenerContainer.afterPropertiesSet();

		return listenerContainer;
	}
}
