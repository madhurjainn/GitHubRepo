package com.zensar.olxadvertiseapplication.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

@RestController
public class OlxAdvertiseController {
	OlxAdvertises advertises = new OlxAdvertises();
	List<OlxAdvertises> advertiseList = new ArrayList<OlxAdvertises>();

	public OlxAdvertiseController() {
		advertiseList.add(new OlxAdvertises(1, "laptop sale", 54000, "Electronic goods", "intel core 3 Sony Vaio",
				"anand", 2104, 2104, "Open"));
	}

	// http://localhost:2040/user
	@RequestMapping(value = "/advertise", method = RequestMethod.POST)

	public ResponseEntity<OlxAdvertises> createNewAdvertise(@RequestBody OlxAdvertises advertiseData,
			@RequestHeader("auth-token") String token) {
		System.out.println("Post");
		if (token.equals("mj66453")) {
			advertiseList.add(advertiseData);
		} else {
			return new ResponseEntity<OlxAdvertises>(HttpStatus.CREATED);
		}
		return new ResponseEntity<OlxAdvertises>(advertiseData, HttpStatus.CREATED);
	}

	// http:localhost:2040/advertise/{id}
	@PutMapping("/advertise/{id}")
	public OlxAdvertises updateAdvertise(@PathVariable("id") int id, @RequestBody OlxAdvertises olxAd) {
		OlxAdvertises availableAd = getSpecificAdvertise(id);
		availableAd.setId(advertises.getId());
		availableAd.setTitle(advertises.getTitle());
		availableAd.setPrice(advertises.getPrice());
		availableAd.setCategory(advertises.getCategory());
		availableAd.setDescription(advertises.getDescription());
		availableAd.setUserName(advertises.getUserName());
		availableAd.setCreatedDate(advertises.getCreatedDate());
		availableAd.setModifiedDate(advertises.getModifiedDate());
		availableAd.setStatus(advertises.getStatus());
		return olxAd;

	}

	@GetMapping("/advertise/search/filtercriteria")
	public OlxAdvertises getSpecificAdvertise(@PathVariable("id") int id) {
		if (advertises.getId() == id) {
			return advertises;
		}
		return null;

	}

	@GetMapping("/user/advertise")
	public List<OlxAdvertises> getAllAdvertises() {
		return advertiseList;
	}

	@DeleteMapping("/user/advertise/{postId}")
	public String DeleteAdvertise(@PathVariable int id) {
		for (OlxAdvertises olxAd : advertiseList) {
			if (olxAd.getId() == id) {
				advertiseList.remove(olxAd);
				return "Data deletion Successfull";
			}
		}
		return "Sorry Data is not available";
	}
	
}
