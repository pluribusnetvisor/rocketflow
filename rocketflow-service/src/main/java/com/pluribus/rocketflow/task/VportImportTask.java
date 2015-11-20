package com.pluribus.rocketflow.task;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.RocketFlowHub;
import com.pluribus.rocketflow.event.VportEventBundle;
import com.pluribus.rocketflow.reader.VportEventReader;

public class VportImportTask extends BaseTask {

	public VportImportTask(RocketFlowContext ctx) {
		super(ctx);
	}

	Logger logger = Logger.getLogger(VportImportTask.class);

	@Override
	protected void _runTask() throws RocketFlowException {
		logger.info("Importing vports");
		VportEventReader reader = new VportEventReader(this.getRocketFlowContext(), this.getNvConfig());
		VportEventBundle event = reader.getEvent();
		getRocketFlowContext().getRocketFlowHub().publish(RocketFlowHub.VPORT_CHANNEL, event);
	}

}
