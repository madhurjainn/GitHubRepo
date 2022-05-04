package com.zensar.olxmasterapplication.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlxMasterRequest {
	private int id;
	private String category;
	private String status;

}
