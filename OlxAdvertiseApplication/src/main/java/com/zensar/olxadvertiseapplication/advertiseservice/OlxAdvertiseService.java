package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

public interface OlxAdvertiseService {
	OlxAdvertises createNewAdvertise(OlxAdvertises advertiseData, String token);
	OlxAdvertises updateAdvertise(@PathVariable("id") int id, @RequestBody OlxAdvertises olxAd);
	OlxAdvertises getSpecificAdvertise( int id);
	List<OlxAdvertises> getAllAdvertises();
	String DeleteAdvertise(@PathVariable int id);
	
}
