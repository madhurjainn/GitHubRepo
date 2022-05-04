package com.zensar.olxloginapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlxResponse {
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private long phone;


}