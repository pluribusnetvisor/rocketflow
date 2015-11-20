package com.pluribus.rocketflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluribus.data.entity.mysql.VportEntityMySQL;
import com.pluribus.data.repo.mysql.VportRepoMySQL;


/**
 * Vport service.
 * 
 * @author Jamie Li
 *
 */
@Service
public class VportService {
	@Autowired
	private VportRepoMySQL vportRepo;
	
	public List<VportEntityMySQL> findAllVports() {
		return vportRepo.findAll();
	}
}
