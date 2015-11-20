package com.pluribus.rocketflow.core;

/**
 * EventReader reads events of its type.
 * 
 * @author jamie
 *
 * @param <T>
 */
public interface EventReader<T> {
	public T getEvent() throws RocketFlowException;
}
