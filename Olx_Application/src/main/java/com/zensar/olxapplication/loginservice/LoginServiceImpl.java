package com.zensar.olxapplication.loginservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.zensar.olxloginapplication.entity.Olx;

@Service
public class LoginServiceImpl implements LoginService {
	Olx olx = new Olx();
	static List<Olx> userDataList = new ArrayList<Olx>();

	static {
		userDataList.add(new Olx(1, "Madhur", "Jain", "madhur.jain44", "madhur@123", "madhur@gmail.com", 1000));
		userDataList.add(new Olx(2, "MadhurJ", "Jainn", "madhur.jain444", "madhur@1234", "madhur@gmail.comm", 1001));

	}

	@Override
	public List<Olx> getAllUsersInformation() {
		return userDataList;
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
	public Olx createUserData(Olx userData, String token) {
		if (token.equals("mj66453")) {
			userDataList.add(userData);
			return userData;
		} return null;
		
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
}
