package com.pluribus.rocketflow.synchronizer;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.pluribus.rocketflow.configuration.RocketFlowServiceConfig;
import com.pluribus.rocketflow.service.RocketFlowService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RocketFlowServiceConfig.class })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class VCenterTest {

	@Autowired
	RocketFlowService rocketFlowService;

	@Before
	public void setup() throws IOException {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testVirtualMachines() {
		try {
			rocketFlowService.importVcenter();
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
