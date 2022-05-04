package com.zensar.olxadvertiseapplication.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlxAdvertiseRequest {

	private int id;
	private String title;
	private int price;
	private String category;
	private String description;
	private String userName;
	private int createdDate;
	private int modifiedDate;
	private String status;
}
