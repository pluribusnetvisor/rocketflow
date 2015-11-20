package com.pluribus.netviser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluribus.data.entity.mysql.VportEntityMySQL;
import com.pluribus.netviser.dto.VportView;
import com.pluribus.rocketflow.service.VportService;
import com.pluribus.rocketflow.util.BeanUtil;

@RestController
public class VportController {
	@Autowired 
	VportService vportService; 
	
	@RequestMapping("/v1/vports/")
	public List<VportView> getAllDevices() throws ReflectiveOperationException {
		List<VportEntityMySQL> ves = vportService.findAllVports();
		
		return BeanUtil.convertList(ves, VportView.class);
	}
	
}
