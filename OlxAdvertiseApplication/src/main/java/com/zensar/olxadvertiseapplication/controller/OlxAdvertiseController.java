package com.zensar.olxadvertiseapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertiseapplication.advertiseservice.OlxAdvertiseService;
import com.zensar.olxadvertiseapplication.dto.AdvertiseDto;

@RestController
public class OlxAdvertiseController {
	
	@Autowired
	private OlxAdvertiseService olxAdvertiseService;

	//@PostMapping(value = "/advertise", produces = { MediaType.APPLICATION_JSON_VALUE,
		//	MediaType.APPLICATION_XML_VALUE }, consumes =  MediaType.APPLICATION_XML_VALUE)
	 @RequestMapping(value = "/advertise", method = RequestMethod.POST)

	public ResponseEntity<AdvertiseDto> createNewAdvertise(@RequestBody AdvertiseDto advertiseData,
			@RequestHeader("auth-token") String token) {
		 AdvertiseDto Advertise=olxAdvertiseService.createNewAdvertise(advertiseData, token);
		if(Advertise==null) {
			return new ResponseEntity<AdvertiseDto>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<AdvertiseDto>(Advertise, HttpStatus.CREATED);
		}
	}

	@PutMapping(value = "/advertise/{id}")
	public AdvertiseDto updateAdvertise(@PathVariable("id") int id, @RequestBody AdvertiseDto olxAd) {
		return olxAdvertiseService.updateAdvertise(id, olxAd);

	}

	@GetMapping(value = "/advertise/search/filtercriteria")
	public AdvertiseDto getSpecificAdvertise(@PathVariable("id") int id) {
		return olxAdvertiseService.getSpecificAdvertise(id);

	}

	@GetMapping(value = "/user/advertise")
	public List<AdvertiseDto> getAllAdvertises() {
		return olxAdvertiseService.getAllAdvertises();
	}

	@DeleteMapping("/user/advertise/{postId}")
	public String DeleteAdvertise(@PathVariable int id) {
		return olxAdvertiseService.DeleteAdvertise(id);

}}
