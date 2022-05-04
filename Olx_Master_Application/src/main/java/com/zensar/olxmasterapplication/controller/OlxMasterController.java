package com.zensar.olxmasterapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterResponse;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;
import com.zensar.olxmasterapplication.masterservice.OlxMasterService;

@RestController
public class OlxMasterController {

	
	@Autowired
	private OlxMasterService olxMasterService;

	@GetMapping("/advertise/category")//, produces = { MediaType.APPLICATION_JSON_VALUE,
			//MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/category",method=RequestMethod.GET)
	public List<OlxMasterResponse> getAllCategories(int pageNumber,int pageSize) {
		return olxMasterService.getAllCategories(pageNumber,pageSize);
	}

	@GetMapping(value = "/advertise/status")//, produces = { MediaType.APPLICATION_JSON_VALUE,
			//MediaType.APPLICATION_XML_VALUE })
	// @RequestMapping(value="/advertise/status",method=RequestMethod.GET)
	public List<OlxMasterResponse> getAllStatus(int pageNumber,int pageSize) {
		return olxMasterService.getAllStatus(pageNumber,pageSize);
	}

}
