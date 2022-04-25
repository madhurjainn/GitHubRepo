package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

@Service
public class OlxAdvertiseServiceImpl implements OlxAdvertiseService {
	OlxAdvertises advertises = new OlxAdvertises();
	static List<OlxAdvertises> advertiseList = new ArrayList<OlxAdvertises>();

	static {
		advertiseList.add(new OlxAdvertises(1, "laptop sale", 54000, "Electronic goods", "intel core 3 Sony Vaio",
				"anand", 2104, 2104, "Open"));
	}

	@Override
	public OlxAdvertises createNewAdvertise(OlxAdvertises advertiseData, String token) {
		if (token.equals("mj66453")) {
			advertiseList.add(advertiseData);
		} else {
			return null;// new ResponseEntity<OlxAdvertises>(HttpStatus.CREATED);
		}
		return null;// new ResponseEntity<OlxAdvertises>(advertiseData, HttpStatus.CREATED);
	}

	@Override
	public OlxAdvertises updateAdvertise(int id, OlxAdvertises olxAd) {
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

	@Override
	public OlxAdvertises getSpecificAdvertise(int id) {
		if (advertises.getId() == id) {
			return advertises;
		}
		return null;
	}

	@Override
	public List<OlxAdvertises> getAllAdvertises() {
		return advertiseList;
	}

	@Override
	public String DeleteAdvertise(int id) {
		for (OlxAdvertises olxAd : advertiseList) {
			if (olxAd.getId() == id) {
				advertiseList.remove(olxAd);
				return "Data deletion Successfull";
			}
		}
		return "Sorry Data is not available";
	}
}
