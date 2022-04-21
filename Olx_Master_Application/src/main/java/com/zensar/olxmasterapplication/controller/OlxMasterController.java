package com.zensar.olxmasterapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmasterapplication.OlxMasterApplication;
import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;
@RestController
public class OlxMasterController {
	
	List<OlxMasterCategory> categoryList=new ArrayList<OlxMasterCategory>();
	static List<OlxMasterStatus> statusList=new ArrayList<OlxMasterStatus>();
	static {
		statusList.add(new OlxMasterStatus(1, "OPEN"));
		statusList.add(new OlxMasterStatus(2, "CLOSED"));
	}
	OlxMasterApplication omp=new OlxMasterApplication();
	public OlxMasterController() {
		categoryList.add(new OlxMasterCategory(1,"Furniture"));
		categoryList.add(new OlxMasterCategory(2,"Cars"));
		categoryList.add(new OlxMasterCategory(4,"RealEstate"));
		categoryList.add(new OlxMasterCategory(5,"Sports"));

	}
	//http://localhost:2030/
	//@GetMapping("/advertize/category")
	@RequestMapping(value="/advertise/category",method=RequestMethod.GET)
	public List<OlxMasterCategory> getAllCategoriest(){
		System.out.println("Get Method");
		return categoryList;
	}
	@RequestMapping(value="/advertise/status",method=RequestMethod.GET)
	public List<OlxMasterStatus> getAllStatus(){
		return statusList;
	}

}
