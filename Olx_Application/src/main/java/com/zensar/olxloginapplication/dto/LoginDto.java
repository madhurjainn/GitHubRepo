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
	private int stockId;
	private String name;
	private String marketName;
	private double price;
}
