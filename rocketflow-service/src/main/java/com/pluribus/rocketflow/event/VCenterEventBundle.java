package com.pluribus.rocketflow.event;

import java.util.List;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowEvent;

public class VCenterEventBundle extends RocketFlowEvent {
	List<VCenterInfo> vcis;

	public VCenterEventBundle(RocketFlowContext rocketflowContext, List<VCenterInfo> vcis) {
		super(rocketflowContext);
		this.vcis = vcis;
	}

	public List<VCenterInfo> getVCenterInfos() {
		return vcis;
	}

	public static class VCenterInfo {
		public String hostname;
		public String mac;
		@Override
		public String toString() {
			return "VCenterInfo [hostname=" + hostname + ", mac=" + mac + "]";
		}


	}
}
