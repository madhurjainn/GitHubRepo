package com.zensar.olxloginapplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.el.stream.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxloginapplication.entity.Olx;

@RestController
//@RequestMapping("/user")
public class OlxLoginController {
	Olx olx=new Olx();
	List<Olx> userDataList = new ArrayList<Olx>();

	public OlxLoginController() {
		userDataList.add(new Olx(1, "Madhur", "Jain", "madhur.jain44", "madhur@123", "madhur@gmail.com", 1000));
		userDataList.add(new Olx(2, "MadhurJ", "Jainn", "madhur.jain444", "madhur@1234", "madhur@gmail.comm", 1001));

	}

	// http://localhost:2022/user
	@GetMapping("/user")
	public List<Olx> getAllUsersInformation() {
		return userDataList;
		/* List<Olx> userData= userDataList.stream().collect(Collectors.toList()); */

		/*
		 * if(userInfo.isPresent()) { return userInfo.get(); }else { return
		 * userInfo.orElseGet(()->{return new Olx();}); }
		 */
	}

//http:localhost//

	//@PostMapping("/users/authenticate")
	@RequestMapping(value = "/users/authenticate", method = RequestMethod.POST)

	public String getLoginData(@RequestBody(required = false) String userName, @RequestBody(required = false) String password,
			@RequestHeader("auth-token") String token) {
		//String s=olx.setUserName("madhur");
		olx.setUserName("madhur");
		olx.setPassword("madhur@123");
		if(token.equals("mj66453")) {
		if (olx.getUserName().equals("madhur") && olx.getPassword().equals("madhur@123")) {
			return "Login Successfull!!!";
		} else {
			return "Sorry, Authentication Failed!!!";
		}
	}
		return "xyz";
		}

	// PostMapping("/user")
	@RequestMapping(value = "/user", method = RequestMethod.POST)

	public ResponseEntity<Olx> createUserData(@RequestBody Olx userData, @RequestHeader("auth-token") String token) {
		System.out.println("Post");
		if (token.equals("mj66453")) {
			userDataList.add(userData);
		} else {
			return new ResponseEntity<Olx>(HttpStatus.CREATED);
		}
		return new ResponseEntity<Olx>(userData, HttpStatus.CREATED);
	}

	
	// http://localhost/user/logout
	@DeleteMapping("/user/logout/{id}")
	public String DeleteUserData(@PathVariable int id) {
		for (Olx olx : userDataList) {
			if (olx.getId() == id) {
				userDataList.remove(olx);
				return "Data deletion Successfull";
			}
		}
		return "Sorry Data is not available";
	}
	

}