package com.zensar.olxmasterapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

import olxmasterservice.OlxMasterService;

@RestController
public class OlxMasterController {

	
	@Autowired
	private OlxMasterService olxMasterService;

	@GetMapping(value = "/advertize/category", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/category",method=RequestMethod.GET)
	public List<OlxMasterCategory> getAllCategoriest() {
		return olxMasterService.getAllCategoriest();
	}

	@GetMapping(value = "/advertise/status", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/status",method=RequestMethod.GET)
	public List<OlxMasterStatus> getAllStatus() {
		return olxMasterService.getAllStatus();
	}

}
