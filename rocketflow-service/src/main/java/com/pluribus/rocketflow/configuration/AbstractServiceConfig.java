package com.pluribus.rocketflow.configuration;

import org.springframework.context.annotation.Bean;

import com.pluribus.rocketflow.subscriber.ConnectionConsoleOutput;
import com.pluribus.rocketflow.subscriber.ConnectionElasticSearchStore;
import com.pluribus.rocketflow.subscriber.ConnectionMySQLStore;
import com.pluribus.rocketflow.subscriber.VCenterConsoleOutput;
import com.pluribus.rocketflow.subscriber.VCenterMySQLStore;
import com.pluribus.rocketflow.subscriber.VportElasticSearchStore;
import com.pluribus.rocketflow.subscriber.VportMySQLStore;

public abstract class AbstractServiceConfig {
	@Bean(name = "vportJpaStore")
	public VportMySQLStore vportJpaStore() {
		return new VportMySQLStore();
	}

	@Bean(name = "vcenterMySQLStore")
	public VCenterMySQLStore vcenterMySQLStore() {
		return new VCenterMySQLStore();
	}

	@Bean(name = "vportElasticSearchStore")
	public VportElasticSearchStore vportElasticSearchStore() {
		return new VportElasticSearchStore();
	}

	@Bean(name = "vcenterConsoleOutput")
	public VCenterConsoleOutput vcenterConsoleOutput() {
		return new VCenterConsoleOutput();
	}

	@Bean(name = "connecionMySQLStore")
	public ConnectionMySQLStore connecionMySQLStore() {
		return new ConnectionMySQLStore();
	}

	@Bean(name = "connectionElasticSearchStore")
	public ConnectionElasticSearchStore connectionElasticSearchStore() {
		return new ConnectionElasticSearchStore();
	}

	@Bean(name = "connectionConsoleOutput")
	public ConnectionConsoleOutput connectionConsoleOutput() {
		return new ConnectionConsoleOutput();
	}


}
