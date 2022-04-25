package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.List;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

public interface OlxAdvertiseService {
	OlxAdvertises createNewAdvertise(OlxAdvertises advertiseData, String token);
	OlxAdvertises updateAdvertise( int id,  OlxAdvertises olxAd);
	OlxAdvertises getSpecificAdvertise( int id);
	List<OlxAdvertises> getAllAdvertises();
	String DeleteAdvertise( int id);
	
}
