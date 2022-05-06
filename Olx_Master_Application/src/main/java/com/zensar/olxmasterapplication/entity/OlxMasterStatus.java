package com.zensar.olxmasterapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OlxMasterStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int statusId;
	private String status;

}
