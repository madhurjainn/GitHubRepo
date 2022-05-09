package com.zensar.olxloginapplication.loginservice;

import java.util.List;

import com.zensar.olxloginapplication.dto.LoginDto;

public interface LoginService {
	//List<Olx> getAllUsersInformation();
	List<LoginDto> getAllUsersInformation();
	String getLoginData( String userName, String password,String token);
	LoginDto createUserData(LoginDto userData, String token);
	String DeleteUserData( int id);
	List<LoginDto> findOlxByFirstName(String firstName);

}
