package com.pluribus.rocketflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluribus.data.entity.mysql.ConnectionEntityMySQL;
import com.pluribus.data.repo.mysql.ConnectionRepoMySQL;

/**
 * 
 * @author jamie
 *
 */
@Service
public class ConnectionService {

	@Autowired
	private ConnectionRepoMySQL connectionRepo;
	
	public List<ConnectionEntityMySQL> getAllVports() {
		return connectionRepo.findAll();
	}
	
}
