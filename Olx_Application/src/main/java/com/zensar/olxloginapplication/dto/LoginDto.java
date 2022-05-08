package com.zensar.olxloginapplication.dto;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private long phone;
}
