package com.zensar.olxmasterapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmasterapplication.dto.MasterDto;
import com.zensar.olxmasterapplication.masterservice.OlxMasterService;

@RestController
public class OlxMasterController {

	
	@Autowired
	private OlxMasterService olxMasterService;

	@GetMapping("/advertise/category")//, produces = { MediaType.APPLICATION_JSON_VALUE,
			//MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/category",method=RequestMethod.GET)
	public List<MasterDto> getAllCategories() {
		return olxMasterService.getAllCategories();
	}

	@GetMapping(value = "/advertise/status")//, produces = { MediaType.APPLICATION_JSON_VALUE,
			//MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/status",method=RequestMethod.GET)
	public List<MasterDto> getAllStatus() {
		return olxMasterService.getAllStatus();
	}

}
