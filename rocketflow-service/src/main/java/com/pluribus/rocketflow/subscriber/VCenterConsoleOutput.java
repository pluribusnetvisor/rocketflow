package com.pluribus.rocketflow.subscriber;

import java.util.List;

import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.VCenterEventBundle;
import com.pluribus.rocketflow.event.VCenterEventBundle.VCenterInfo;

public class VCenterConsoleOutput extends EventObserver<VCenterEventBundle> {

	@Override
	public void onEvent(VCenterEventBundle event) throws Exception {
		List<VCenterInfo> vcis = event.getVCenterInfos();

		for (VCenterInfo vci : vcis) {
			System.out.println(vci);

		}
	}

}
