package com.HRMS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String FullName;
	
	private String Email;
	
	private String Address;
	
	private String Qulification;
	
	private String Password;
 
}
