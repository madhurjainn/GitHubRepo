package com.zensar.olxloginapplication.loginservice;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zensar.olxloginapplication.dto.LoginDto;
import com.zensar.olxloginapplication.entity.Olx;
import com.zensar.olxloginapplication.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	Olx olx = new Olx();
	private ModelMapper modelMapper = new ModelMapper();
	@Autowired
	private LoginRepository loginRepository;
	static List<Olx> userDataList = new ArrayList<Olx>();

	static {
		userDataList.add(new Olx(1, "Madhur", "Jain", "madhur.jain44", "madhur@123", "madhur@gmail.com", 1000));
		userDataList.add(new Olx(2, "MadhurJ", "Jainn", "madhur.jain444", "madhur@1234", "madhur@gmail.comm", 1001));

	}

	@Override
	public List<LoginDto> getAllUsersInformation(int pageNumber, int pageSize) {
		Page<Olx> pageStocks= loginRepository.findAll(PageRequest.of(pageNumber, pageSize));
		List<Olx> content=pageStocks.getContent();
		List<LoginDto> olxResponses=new ArrayList<>();
		for(Olx stock:content) {
			LoginDto olxResponse=modelMapper.map(olx,LoginDto.class);
			olxResponses.add(olxResponse);
			/*
			 * OlxResponse MapToResponse=MapToResponse(olx);
			 * olxResponses.add(MapToResponse);
			 */
		}
		return olxResponses;
	}

	@Override
	public String getLoginData(String userName, String password, String token) {
		olx.setUserName("madhur");
		olx.setPassword("madhur@123");
		if (token.equals("mj66453")) {
			if (olx.getUserName().equals("madhur") && olx.getPassword().equals("madhur@123")) {
				return "Login Successfull!!!";
			} else {
				return "Sorry, Authentication Failed!!!";
			}
		}
		return "Invalid token";
	}

	@Override
	public LoginDto createUserData(Olx userData, String token) {
		Olx newOlx=modelMapper.map(olx,Olx.class);
		 if (token.equals("mj66453")) {
			 Olx olx1 = loginRepository.save(newOlx);
			 return modelMapper.map(olx1,LoginDto.class);
			 } else {
		  return null;
		  }

	}
	

	@Override
	public String DeleteUserData(int id) {
		for (Olx olx : userDataList) {
			if (olx.getId() == id) {
				userDataList.remove(olx);
				return "Data deletion Successfull";
			}
		}
		return "Sorry Data is not available";
	}

	/*
	 * public Olx MapToOlx(OlxRequest olxRequest) { Olx newOlx=new Olx();
	 * newOlx.setId(olxRequest.getId());
	 * newOlx.setFirstName(olxRequest.getFirstName());
	 * newOlx.setLastName(olxRequest.getLastName());
	 * newOlx.setUserName(olxRequest.getUserName());
	 * newOlx.setPassword(olxRequest.getPassword());
	 * newOlx.setEmail(olxRequest.getEmail());
	 * newOlx.setPhone(olxRequest.getPhone()); return newOlx;
	 * 
	 * 
	 * } public Olx MapToOlx(OlxResponse olxResponse) { Olx newOlx=new Olx();
	 * newOlx.setId(olxResponse.getId());
	 * newOlx.setFirstName(olxResponse.getFirstName());
	 * newOlx.setLastName(olxResponse.getLastName());
	 * newOlx.setUserName(olxResponse.getUserName());
	 * newOlx.setPassword(olxResponse.getPassword());
	 * newOlx.setEmail(olxResponse.getEmail());
	 * newOlx.setPhone(olxResponse.getPhone()); return newOlx;
	 * 
	 * }
	 */
	public LoginDto MapToResponse(Olx olx) {
		LoginDto olxResponse=new LoginDto();
		olx.setId(olx.getId());
		olx.setFirstName(olx.getFirstName());
		olx.setLastName(olx.getLastName());
		olx.setUserName(olx.getUserName());
		olx.setPassword(olx.getPassword());
		olx.setEmail(olx.getEmail());
		olx.setPhone(olx.getPhone());
		return olxResponse;
		/*
		 * olxResponse.setMarketName(olx.getMarketName());
		 * olxResponse.setName(olx.getName()); Response.setPrice(olx.getPrice()); return
		 * olxResponse;
		 */
		
	}
}
