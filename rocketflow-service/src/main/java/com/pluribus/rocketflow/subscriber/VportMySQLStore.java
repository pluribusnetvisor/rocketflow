package com.pluribus.rocketflow.subscriber;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.data.entity.VportEntity;
import com.pluribus.data.entity.mysql.VportEntityMySQL;
import com.pluribus.data.repo.mysql.VportRepoMySQL;
import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.VportEventBundle;
import com.pluribus.rocketflow.util.BeanUtil;

public class VportMySQLStore extends EventObserver<VportEventBundle> {
	private static Logger logger = Logger.getLogger(VportMySQLStore.class);

	@Autowired
	private VportRepoMySQL vportRepo;

	@Override
	public void onEvent(VportEventBundle event) throws Exception {
		int insertCount = 0;
		int updateCount = 0;
		List<VportEntity> ves = event.getVports();

		for (VportEntity ve : ves) {
			List<VportEntityMySQL> vpes = vportRepo.findBySwitchAndMac(ve.getSwitchId(), ve.getMac().toString());
			if (vpes.size() > 0) {
				for (VportEntityMySQL vpe : vpes) {
					// update
					BeanUtil.copyProperties(null, ve, vpe, null, "id");
					updateCount++;
					vportRepo.save(vpe);
				}
			} else {
				// insert
				VportEntityMySQL vpe = BeanUtil.convert(ve, VportEntityMySQL.class);
				insertCount++;
				vportRepo.save(vpe);
			}

		}

		logger.info("vport import completed. updateCount=" + updateCount + ", insertCount = " + insertCount);
	}

}
