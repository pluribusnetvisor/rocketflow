package com.pluribus.rocketflow.subscriber;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.data.entity.VportEntity;
import com.pluribus.data.entity.elasticsearch.VportEntityES;
import com.pluribus.data.repo.elasticsearch.VportRepoES;
import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.VportEventBundle;
import com.pluribus.rocketflow.util.BeanUtil;

public class VportElasticSearchStore extends EventObserver<VportEventBundle> {
	private static Logger logger = Logger.getLogger(VportElasticSearchStore.class);

	@Autowired
	private VportRepoES vportRepository;

	@Override
	public void onEvent(VportEventBundle event) throws Exception {
		// Get the switch name
//		String switchName = (node == null) ? "na" : node.getName();
		Date currentTime = new Date();

		List<VportEntity> ves = event.getVports();
		List<VportEntityES> toBeSaved = new ArrayList<VportEntityES>(ves.size());

		for (VportEntity ve : ves) {
			// insert
			VportEntityES vpe = BeanUtil.convert(ve, VportEntityES.class);
			vpe.setLastModified(currentTime);
//			vpe.setSwitchName(switchName);
			toBeSaved.add(vpe);
		}
		if (toBeSaved.size() > 0) {
			vportRepository.save(toBeSaved);
		}

		logger.info("vport: upserted=" + ves.size());
	}
}
