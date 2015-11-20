package com.pluribus.data.repo.mysql;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.pluribus.data.configuration.RocketFlowMySQLConfig;
import com.pluribus.data.entity.mysql.VportEntityMySQL;
import com.pluribus.data.repo.mysql.VportRepoMySQL;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RocketFlowMySQLConfig.class})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
public class VportRepoTest {
	@Autowired 
	VportRepoMySQL deviceRepo;
	
	@Before
	public void setup() {
	}
	
	@After
	public void tearDown() {
	}

	@Test
	@Transactional
	public void testAll() {
		List<VportEntityMySQL> ves = deviceRepo.findAll();
		
		System.out.println("vport count=" + ves.size() + " imported.");
	}
	
}
