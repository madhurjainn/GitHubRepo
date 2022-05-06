package com.zensar.olxadvertiseapplication.dto;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertiseDto {
		@Id
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
