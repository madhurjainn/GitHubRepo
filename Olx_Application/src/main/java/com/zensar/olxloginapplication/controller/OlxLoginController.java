package com.zensar.olxloginapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxloginapplication.dto.LoginDto;
import com.zensar.olxloginapplication.entity.Olx;
import com.zensar.olxloginapplication.loginservice.LoginService;

@RestController
public class OlxLoginController {
	
	@Autowired
	private LoginService loginService;
	// http://localhost:2022/user
	@GetMapping(value = "/user")
	public List<LoginDto> getAllUsersInformation() {
		return loginService.getAllUsersInformation();
		
	}

//http:localhost//

	@PostMapping(value = "/users/authenticate")
	// @RequestMapping(value = "/users/authenticate", method = RequestMethod.POST)

	public String getLoginData(@RequestBody String userName,
			@RequestBody String password, @RequestHeader("auth-token") String token) {
		return loginService.getLoginData(userName, password, token);
		
	}

	@PostMapping(value = "/user")
	// RequestMapping(value = "/user", method = RequestMethod.POST)

	public ResponseEntity<LoginDto> createUserData(@RequestBody LoginDto userData, @RequestHeader("auth-token") String token) {
		LoginDto olxResponse= loginService.createUserData(userData, token);
		if(olxResponse==null) {
			return new ResponseEntity<LoginDto>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<LoginDto>(olxResponse,HttpStatus.CREATED);
		}
		}
		
	@DeleteMapping("/user/logout/{id}")
	public String DeleteUserData(@PathVariable int id) {
		return loginService.DeleteUserData(id);
	}

}
