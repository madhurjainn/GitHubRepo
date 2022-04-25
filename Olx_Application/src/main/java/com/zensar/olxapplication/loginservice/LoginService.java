package com.zensar.olxapplication.loginservice;

import java.util.List;

import com.zensar.olxloginapplication.entity.Olx;

public interface LoginService {
	List<Olx> getAllUsersInformation();
	String getLoginData( String userName, String password,String token);
	Olx createUserData( Olx userData, String token);
	String DeleteUserData( int id);

}
