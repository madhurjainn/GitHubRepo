package com.zensar.olxadvertiseapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertiseapplication.advertiseservice.OlxAdvertiseService;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseRequest;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseResponse;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

@RestController
public class OlxAdvertiseController {
	
	@Autowired
	private OlxAdvertiseService olxAdvertiseService;

	@PostMapping(value = "/advertise", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes =  MediaType.APPLICATION_XML_VALUE)
	// @RequestMapping(value = "/advertise", method = RequestMethod.POST)

	public ResponseEntity<OlxAdvertises> createNewAdvertise(@RequestBody OlxAdvertiseRequest advertiseData,
			@RequestHeader("auth-token") String token) {
		OlxAdvertiseResponse Advertise=olxAdvertiseService.createNewAdvertise(advertiseData, token);
		if(Advertise==null) {
			return new ResponseEntity<OlxAdvertises>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<OlxAdvertises>(HttpStatus.CREATED);
		}
	}

	@PutMapping(value = "/advertise/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes =  MediaType.APPLICATION_XML_VALUE)
	public OlxAdvertiseResponse updateAdvertise(@PathVariable("id") int id, @RequestBody OlxAdvertiseRequest olxAd) {
		return olxAdvertiseService.updateAdvertise(id, olxAd);

	}

	@GetMapping(value = "/advertise/search/filtercriteria", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public OlxAdvertiseResponse getSpecificAdvertise(@PathVariable("id") int id) {
		return olxAdvertiseService.getSpecificAdvertise(id);

	}

	@GetMapping(value = "/user/advertise", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<OlxAdvertiseResponse> getAllAdvertises(@RequestParam(value="pageNumber",defaultValue = "0",required = false) int pageNumber,@RequestParam(value="pageSize",defaultValue = "5",required = false) int pageSize) {
		return olxAdvertiseService.getAllAdvertises(pageNumber,pageSize);
	}

	@DeleteMapping("/user/advertise/{postId}")
	public String DeleteAdvertise(@PathVariable int id) {
		return olxAdvertiseService.DeleteAdvertise(id);

}}
