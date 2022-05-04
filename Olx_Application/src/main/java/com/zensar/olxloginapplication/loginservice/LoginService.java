package com.zensar.olxloginapplication.loginservice;

import java.util.List;

import com.zensar.olxloginapplication.entity.Olx;
import com.zensar.olxloginapplication.entity.OlxResponse;

public interface LoginService {
	//List<Olx> getAllUsersInformation();
	List<OlxResponse> getAllUsersInformation(int pageNumber, int pageSize);
	String getLoginData( String userName, String password,String token);
	OlxResponse createUserData( Olx userData, String token);
	String DeleteUserData( int id);

}
