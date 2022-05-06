package com.zensar.olxmasterapplication.dto;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterDto {
	@Id
	private int id;
	private String category;
	private int statusId;
	private String status;

}
