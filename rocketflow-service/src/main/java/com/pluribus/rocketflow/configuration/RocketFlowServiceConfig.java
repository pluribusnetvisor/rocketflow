package com.pluribus.rocketflow.configuration;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pluribus.data.configuration.RocketFlowElasticSearchConfig;
import com.pluribus.data.configuration.RocketFlowMySQLConfig;
import com.pluribus.rocketflow.service.DnsService;
import com.pluribus.rocketflow.service.PortMappingService;
import com.pluribus.rocketflow.service.RocketFlowService;

@Configuration
@Import({ RocketFlowMySQLConfig.class, RocketFlowElasticSearchConfig.class })
public class RocketFlowServiceConfig extends AbstractServiceConfig {

	@Bean
	public RocketFlowService rocketflowService() {
		RocketFlowService rocketflowService = new RocketFlowService();
		rocketflowService.start();
		return rocketflowService;
	}

	@Bean
	public DnsService dnsService() {
		return new DnsService();
	}

	@Bean
	public PortMappingService portMappingService() throws IOException {
		return new PortMappingService();
	}
}
