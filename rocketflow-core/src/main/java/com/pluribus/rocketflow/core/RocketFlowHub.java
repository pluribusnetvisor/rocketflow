package com.pluribus.rocketflow.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Handles the pub/sub pattern. Channels should be registered before it can be used. 
 * 
 * @author jamie
 *
 */

public class RocketFlowHub {
	
	public static String CONN_CHANNEL = "conn";
	public static String VPORT_CHANNEL = "vport";
	public static String VCENTER_CHANNEL = "vcenter";
	
	private Map<String, DataEventChannel> channelMap = new HashMap<String, DataEventChannel>();

	
	/**
	 * Register a channel with the event type.
	 * @param channelName
	 * @param clz
	 */
	public <T extends RocketFlowEvent> void registerChannel(String channelName, Class<T> clz) {
		DataEventChannel channel = new DataEventChannel();
		channelMap.put(channelName, channel);
	}
	
	/**
	 * Subscribe an Observer to a channel.
	 * 
	 * @param channelName
	 * @param observer
	 * @throws RocketFlowException
	 */
	public <T> void subscribe(String channelName, EventObserver<T> observer) throws RocketFlowException {
		DataEventChannel ch = (DataEventChannel) channelMap.get(channelName);
		if (ch != null) {
			ch.addObserver(observer);
		} else {
			throw new RocketFlowException("Invalid channel: " + channelName);
		}
	}
	
	/**
	 * Publish an event to a channel.
	 * 
	 * @param channelName
	 * @param event
	 * @throws RocketFlowException
	 */
	public <T extends RocketFlowEvent> void publish(String channelName, T event) throws RocketFlowException {
		DataEventChannel ch = (DataEventChannel) channelMap.get(channelName);
		
		if (ch != null) {
			ch.setEvent(event);
			ch.notifyObservers(event);
		} else {
			throw new RocketFlowException("Invalid channel: " + channelName);
		}
	}
}
