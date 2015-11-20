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
import com.pluribus.data.entity.mysql.ConnectionEntityMySQL;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RocketFlowMySQLConfig.class})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
public class ConnectionRepoTest {
	@Autowired 
	ConnectionRepoMySQL connectionRepo;
	
	@Before
	public void setup() {
	}
	
	@After
	public void tearDown() {
	}

	@Test
	@Transactional
	public void testAll() {
		List<ConnectionEntityMySQL> ces = connectionRepo.findAll();
		System.out.println(ces.size());
//		for (ConnectionEntity ce : ces) {
//			System.out.println(ce);
//		}
	}
	
}
