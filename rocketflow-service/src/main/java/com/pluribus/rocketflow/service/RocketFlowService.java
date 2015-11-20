package com.pluribus.rocketflow.service;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.RocketFlowHub;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.event.VCenterEventBundle;
import com.pluribus.rocketflow.event.VportEventBundle;
import com.pluribus.rocketflow.rest.NvosRest;
import com.pluribus.rocketflow.subscriber.ConnectionElasticSearchStore;
import com.pluribus.rocketflow.subscriber.VportElasticSearchStore;
import com.pluribus.rocketflow.task.BaseTask;
import com.pluribus.rocketflow.task.ConnectionImportTask;
import com.pluribus.rocketflow.task.VCenterImportTask;
import com.pluribus.rocketflow.task.VportImportTask;
import com.pluribus.rocketflow.task.rest.ConnectionImportRestTask;
import com.pluribus.rocketflow.task.rest.RestBaseTask;

import it.sauronsoftware.cron4j.Scheduler;

public class RocketFlowService implements RocketFlowContext {
	private static Logger logger = Logger.getLogger(RocketFlowService.class);

	@Autowired
	PortMappingService portMappingService;

	/************************************
	 * Vport Stores
	 ************************************/
//	@Autowired
//	private VportMySQLStore vportMySQLStore;

	@Autowired
	private VportElasticSearchStore vportElasticSearchStore;


//	@Autowired
//	private VCenterMySQLStore vcenterMySQLStore;

	/************************************
	 * Connection Stores
	 ************************************/
	@Autowired
	private ConnectionElasticSearchStore connectionElasticSearchStore;

//	@Autowired
//	private ConnectionMySQLStore connMySQLStore;

//	@Autowired
//	private ConnectionConsoleOutput connConsole;
//

	/************************************
	 * VCenter Stores
	 ************************************/
//	@Autowired
//	private VCenterConsoleOutput vcenterConsole;

	@Autowired
	private DnsService dnsService;

	private RocketFlowHub dfhub;

	private boolean started = false;

	@PostConstruct
	public void init() throws RocketFlowException {
		dfhub = new RocketFlowHub();

		dfhub.registerChannel(RocketFlowHub.VPORT_CHANNEL, VportEventBundle.class);
		dfhub.registerChannel(RocketFlowHub.CONN_CHANNEL, ConnectionEventBundle.class);
		dfhub.registerChannel(RocketFlowHub.VCENTER_CHANNEL, VCenterEventBundle.class);

		dfhub.subscribe(RocketFlowHub.VPORT_CHANNEL, vportElasticSearchStore);
		dfhub.subscribe(RocketFlowHub.CONN_CHANNEL, connectionElasticSearchStore);
//		dfhub.subscribe(RocketFlowHub.VPORT_CHANNEL, vportMySQLStore);
//		dfhub.subscribe(RocketFlowHub.CONN_CHANNEL, connMySQLStore);
//		dfhub.subscribe(RocketFlowHub.CONN_CHANNEL, connConsole);
//		dfhub.subscribe(RocketFlowHub.VCENTER_CHANNEL, vcenterConsole);
//		dfhub.subscribe(RocketFlowHub.VCENTER_CHANNEL, vcenterMySQLStore);
	}

	private Scheduler scheduler = new Scheduler();

	public void start() {
		synchronized(this) {
			if (started) {
				return;
			}

			started = true;
			scheduler.schedule("* * * * *", new Runnable() {
				@Override
				public void run() {
					importConntection();
				}
			});

			scheduler.start();
			logger.info("RocketFlowService started");
		}
	}

	public void importVport() {
		logger.info("Importing vports");
		BaseTask task = new VportImportTask(this);
		task.runTask();
	}

	public void importConntection() {
		logger.info("Importing connections");
		BaseTask task = new ConnectionImportTask(this);
		task.runTask();
	}

	private String restHostname = "10.20.19.103";
	private int restPort = 80;
	private String authorization = "Basic bmV0d29yay1hZG1pbjp0ZXN0MTIz";

	public void importConntectionRest() {
		NvosRest nvosRest = new NvosRest(restHostname, restPort, authorization);
		RestBaseTask task = new ConnectionImportRestTask(this, nvosRest);
		task.runTask();
	}

	public void importVcenter() {
		logger.info("Importing vcenter");
		BaseTask task = new VCenterImportTask(this);
		task.runTask();
	}

	@Override
	public DnsService getDnsService() {
		return dnsService;
	}

	@Override
	public RocketFlowHub getRocketFlowHub() {
		return this.dfhub;
	}

	@Override
	public PortMappingService getPortMappingService() {
		return portMappingService;
	}

}
