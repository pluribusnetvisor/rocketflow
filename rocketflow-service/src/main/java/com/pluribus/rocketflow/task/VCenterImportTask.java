package com.pluribus.rocketflow.task;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.RocketFlowHub;
import com.pluribus.rocketflow.event.VCenterEventBundle;
import com.pluribus.rocketflow.reader.VCenterEventReader;

public class VCenterImportTask extends BaseTask {
	Logger logger = Logger.getLogger(VCenterImportTask.class);

	public VCenterImportTask(RocketFlowContext ctx) {
		super(ctx);
	}

	@Override
	protected void _runTask() throws RocketFlowException {
		logger.info("Importing from vCenter");
		VCenterEventReader reader = new VCenterEventReader(this.getRocketFlowContext());
		VCenterEventBundle event = reader.getEvent();
		getRocketFlowContext().getRocketFlowHub().publish(RocketFlowHub.VCENTER_CHANNEL, event);
	}

}
