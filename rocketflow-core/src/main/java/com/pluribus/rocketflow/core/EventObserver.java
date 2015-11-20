package com.pluribus.rocketflow.core;

import java.util.Observable;
import java.util.Observer;

/**
 * EventObserver implements the subscriber of the pub/sub pattern. 
 * @author jamie
 *
 * @param <T>
 */
public abstract class EventObserver<T> implements Observer {

	@Override
	public void update(Observable observable, Object arg) {
		@SuppressWarnings("unchecked")
		T event = (T) arg;
		try {
			onEvent(event);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * called when an event is published.
	 * 
	 * @param event
	 * @throws Exception
	 */
	public abstract void onEvent(T event) throws Exception;

}
