package com.pluribus.rocketflow.subscriber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.data.entity.mysql.VportEntityMySQL;
import com.pluribus.data.repo.mysql.VportRepoMySQL;
import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.VCenterEventBundle;
import com.pluribus.rocketflow.event.VCenterEventBundle.VCenterInfo;

public class VCenterMySQLStore extends EventObserver<VCenterEventBundle> {
	// private static Logger logger = Logger.getLogger(VCenterJpaStore.class);

	@Autowired
	private VportRepoMySQL vportRepo;

	@Override
	public void onEvent(VCenterEventBundle event) throws Exception {
		List<VCenterInfo> vcis = event.getVCenterInfos();

		for (VCenterInfo vci : vcis) {
			List<VportEntityMySQL> ves = vportRepo.findByMac(vci.mac);
			for (VportEntityMySQL ve : ves) {
				ve.setHostname(vci.hostname);
				vportRepo.save(ve);
			}
		}
	}

}
