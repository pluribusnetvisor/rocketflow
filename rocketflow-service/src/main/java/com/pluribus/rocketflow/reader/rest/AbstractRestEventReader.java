package com.pluribus.rocketflow.reader.rest;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.EventReader;
import com.pluribus.rocketflow.event.NvosEvent;
import com.pluribus.rocketflow.rest.NvosRest;

public abstract class AbstractRestEventReader<T extends NvosEvent> implements EventReader<T> {
	private RocketFlowContext rocketFlowContext;
	private NvosRest nvosRest;

	public AbstractRestEventReader(RocketFlowContext ctx, NvosRest nvosRest) {
		this.rocketFlowContext = ctx;
		this.nvosRest = nvosRest;
	}

	public RocketFlowContext getRocketFlowContext() {
		return rocketFlowContext;
	}

	public void setRocketFlowContext(RocketFlowContext rocketFlowContext) {
		this.rocketFlowContext = rocketFlowContext;
	}

	public NvosRest getNvosRest() {
		return nvosRest;
	}

	public void setNvosRest(NvosRest nvosRest) {
		this.nvosRest = nvosRest;
	}


	@Override
	public T getEvent() throws RocketFlowException {
		try {
			return readEvents();
		} catch (Exception ex) {
			throw new RocketFlowException(ex);
		}
	}

	protected abstract T readEvents() throws Exception;

}
