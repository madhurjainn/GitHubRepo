package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseRequest;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseResponse;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;
import com.zensar.olxadvertiseappliction.repository.AdvertiseRepository;

@Service
public class OlxAdvertiseServiceImpl implements OlxAdvertiseService {
	OlxAdvertises advertises = new OlxAdvertises();
	private AdvertiseRepository advertiseRepository;
	private ModelMapper modelMapper = new ModelMapper();

	static List<OlxAdvertises> advertiseList = new ArrayList<OlxAdvertises>();

	static {
		advertiseList.add(new OlxAdvertises(1, "laptop sale", 54000, "Electronic goods", "intel core 3 Sony Vaio",
				"anand", 2104, 2104, "Open"));
	}

	@Override
	public OlxAdvertiseResponse createNewAdvertise(OlxAdvertiseRequest olxRequest, String token) {
		OlxAdvertises newOlx = modelMapper.map(olxRequest, OlxAdvertises.class);

		if (token.equals("ag66543")) {
			OlxAdvertises olx1 = advertiseRepository.save(newOlx);
			return modelMapper.map(olx1, OlxAdvertiseResponse.class);

		} else {
			return null;
		}
	}
	 public OlxAdvertiseResponse updateAdvertise(int id, OlxAdvertiseRequest olxAdvertiseRequest) {

		 OlxAdvertiseResponse olxResponse = getSpecificAdvertise(id);



		 OlxAdvertises olx1 = modelMapper.map(olxAdvertiseRequest, OlxAdvertises.class);



		 OlxAdvertises olx2 = advertiseRepository.save(olx1);
		 return modelMapper.map(olx2, OlxAdvertiseResponse.class);
		 }
	@Override
	/*
	 * public OlxAdvertises getSpecificAdvertise(int id) { if (advertises.getId() ==
	 * id) { return advertises; } return null; }
	 */
	public OlxAdvertiseResponse getSpecificAdvertise(int id) {
	OlxAdvertises olxResponse = advertiseRepository.findById(id).get();
	return modelMapper.map(olxResponse, OlxAdvertiseResponse.class);
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

	@Override
	public List<OlxAdvertiseResponse> getAllAdvertises(int pageNumber, int pageSize) {
		Page<OlxAdvertises> pageOlx = advertiseRepository.findAll(PageRequest.of(pageNumber, pageSize));
		List<OlxAdvertises> content = pageOlx.getContent();
		List<OlxAdvertiseResponse> olxAdvertiseResponses = new ArrayList<>();
		for (OlxAdvertises stock : content) {
			OlxAdvertiseResponse olxResponse = modelMapper.map(pageOlx, OlxAdvertiseResponse.class);
			olxAdvertiseResponses.add(olxResponse);
		}
		return olxAdvertiseResponses;

	}

}
