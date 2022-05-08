package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxadvertiseapplication.dto.AdvertiseDto;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;
import com.zensar.olxadvertiseappliction.repository.AdvertiseRepository;
@Service
public class OlxAdvertiseServiceImpl implements OlxAdvertiseService {
	@Autowired
	private AdvertiseRepository advertiseRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	OlxAdvertises advertises = new OlxAdvertises();

	/*
	 * static List<OlxAdvertises> advertiseList = new ArrayList<OlxAdvertises>();
	 * 
	 * static { advertiseList.add(new OlxAdvertises(1, "laptop sale", 54000,
	 * "Electronic goods", "intel core 3 Sony Vaio", "anand", 2104, 2104, "Open"));
	 * }
	 */

	@Override
	public AdvertiseDto createNewAdvertise(AdvertiseDto olxRequest, String token) {
		OlxAdvertises newOlx = modelMapper.map(olxRequest, OlxAdvertises.class);

		if (token.equals("ag66543")) {
			OlxAdvertises olx1 = advertiseRepository.save(newOlx);
			return modelMapper.map(olx1, AdvertiseDto.class);

		} else {
			return null;
		}
	}
	 public AdvertiseDto updateAdvertise(int id, AdvertiseDto olxAdvertiseRequest) {

		 AdvertiseDto olxResponse = getSpecificAdvertise(id);



		 OlxAdvertises olx1 = modelMapper.map(olxAdvertiseRequest, OlxAdvertises.class);



		 OlxAdvertises olx2 = advertiseRepository.save(olx1);
		 return modelMapper.map(olx2, AdvertiseDto.class);
		 }
	@Override
	/*
	 * public OlxAdvertises getSpecificAdvertise(int id) { if (advertises.getId() ==
	 * id) { return advertises; } return null; }
	 */
	public AdvertiseDto getSpecificAdvertise(int id) {
	OlxAdvertises olxResponse = advertiseRepository.findById(id).get();
	return modelMapper.map(olxResponse, AdvertiseDto.class);
	}


	@Override
	public String DeleteAdvertise(int id) {
		/*
		 * for (OlxAdvertises olxAd : ) { if (olxAd.getId() == id) {
		 * advertiseList.remove(olxAd); return "Data deletion Successfull"; } } return
		 * "Sorry Data is not available";
		 */
		advertiseRepository.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public List<AdvertiseDto> getAllAdvertises() {
		List<OlxAdvertises> listOlx = advertiseRepository.findAll();
		List<AdvertiseDto> olxAdvertiseResponses = new ArrayList<>();
		for (OlxAdvertises stock : listOlx) {
			AdvertiseDto olxResponse = modelMapper.map(stock, AdvertiseDto.class);
			olxAdvertiseResponses.add(olxResponse);
		}
		return olxAdvertiseResponses;

	}
	
}
