package com.pluribus.rocketflow.reader;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.EventReader;
import com.pluribus.rocketflow.event.NvosEvent;

public abstract class AbstractNvosEventReader<T extends NvosEvent> implements EventReader<T> {
	private RocketFlowContext rocketFlowContext;

	public AbstractNvosEventReader(RocketFlowContext ctx) {
		this.rocketFlowContext = ctx;
	}

	public RocketFlowContext getRocketFlowContext() {
		return this.rocketFlowContext;
	}

	public void setContext(RocketFlowContext rocketflowContext) {
		this.rocketFlowContext = rocketflowContext;
	}

	@Override
	public T getEvent() throws RocketFlowException {
		try {
			return readFabricEvents();
		} catch (Exception ex) {
			throw new RocketFlowException(ex);
		}
	}

	protected abstract T readFabricEvents() throws Exception;

}
