package com.pluribus.rocketflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.pluribus.netviser.NetviserRestApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NetviserRestApplication.class)
@WebAppConfiguration
public class NetviserRestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
