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
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertiseapplication.advertiseservice.OlxAdvertiseService;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

@RestController
public class OlxAdvertiseController {
	
	@Autowired
	private OlxAdvertiseService olxAdvertiseService;

	@PostMapping(value = "/advertise", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes =  MediaType.APPLICATION_XML_VALUE)
	// @RequestMapping(value = "/advertise", method = RequestMethod.POST)

	public ResponseEntity<OlxAdvertises> createNewAdvertise(@RequestBody OlxAdvertises advertiseData,
			@RequestHeader("auth-token") String token) {
		OlxAdvertises Advertise=olxAdvertiseService.createNewAdvertise(advertiseData, token);
		if(Advertise==null) {
			return new ResponseEntity<OlxAdvertises>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<OlxAdvertises>(HttpStatus.CREATED);
		}
	}

	@PutMapping(value = "/advertise/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes =  MediaType.APPLICATION_XML_VALUE)
	public OlxAdvertises updateAdvertise(@PathVariable("id") int id, @RequestBody OlxAdvertises olxAd) {
		return olxAdvertiseService.updateAdvertise(id, olxAd);

	}

	@GetMapping(value = "/advertise/search/filtercriteria", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public OlxAdvertises getSpecificAdvertise(@PathVariable("id") int id) {
		return olxAdvertiseService.getSpecificAdvertise(id);

	}

	@GetMapping(value = "/user/advertise", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<OlxAdvertises> getAllAdvertises() {
		return olxAdvertiseService.getAllAdvertises();
	}

	@DeleteMapping("/user/advertise/{postId}")
	public String DeleteAdvertise(@PathVariable int id) {
		return olxAdvertiseService.DeleteAdvertise(id);

}}
