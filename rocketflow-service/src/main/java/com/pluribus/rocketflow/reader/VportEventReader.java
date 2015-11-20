package com.pluribus.rocketflow.reader;

import java.util.ArrayList;
import java.util.List;

import com.pluribus.data.entity.VportEntity;
import com.pluribus.data.entity.elasticsearch.VportEntityES;
import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.event.VportEventBundle;
import com.pluribus.rocketflow.util.BeanUtil;
import com.pluribusnetworks.config.Config;
import com.pluribusnetworks.config.Vport;
import com.pluribusnetworks.io.Result;

public class VportEventReader extends AbstractNvosEventReader<VportEventBundle> {

	Config nvConfig;

	public VportEventReader(RocketFlowContext ctx, Config nvConfig) {
		super(ctx);
		this.nvConfig = nvConfig;
	}

	@Override
	protected VportEventBundle readFabricEvents() throws Exception {
		RocketFlowContext ctx = this.getRocketFlowContext();

		List<Vport> vps = new ArrayList<Vport>();
		Vport vp = new Vport();
		Result result = nvConfig.showVport(vp, vps);
		if (result.code != 0) {
			throw new RocketFlowException(result.code, result.message);
		}

		List<VportEntity> ves = convert(vps);

		VportEventBundle ve = new VportEventBundle(ctx, "", ves);

		return ve;
	}


	private List<VportEntity> convert(List<Vport> vps) {
		List<VportEntity> ves = new ArrayList<VportEntity>(vps.size());

		for (Vport vi : vps) {
			VportEntity ve = new VportEntityES();

			BeanUtil.copyProperties(vi, ve);

			// copy extra attributes
			ve.setIp(vi.getIpStr());
			if (vi.getMac() != null) {
				ve.setMac(vi.getMac().toString());
			}
			if (vi.getPortFlags() != null) {
				ve.setPortFlags(vi.getPortFlags().toString());
			}
			ves.add(ve);
		}

		return ves;
	}

}
