package com.zensar.olxloginapplication.loginservice;

import java.util.List;

import com.zensar.olxloginapplication.dto.LoginDto;
import com.zensar.olxloginapplication.entity.Olx;

public interface LoginService {
	//List<Olx> getAllUsersInformation();
	List<LoginDto> getAllUsersInformation(int pageNumber, int pageSize);
	String getLoginData( String userName, String password,String token);
	LoginDto createUserData( Olx userData, String token);
	String DeleteUserData( int id);

}
