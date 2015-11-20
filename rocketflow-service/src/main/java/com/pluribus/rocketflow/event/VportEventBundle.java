package com.pluribus.rocketflow.event;

import java.util.List;

import com.pluribus.data.entity.VportEntity;
import com.pluribus.rocketflow.core.RocketFlowContext;

public class VportEventBundle extends NvosEvent {
	private List<VportEntity> vports;

	public VportEventBundle(RocketFlowContext rocketflowContext, String fabricName, List<VportEntity> vports) {
		super(rocketflowContext, fabricName);
		this.vports = vports;
	}

	public List<VportEntity> getVports() {
		return vports;
	}
}
