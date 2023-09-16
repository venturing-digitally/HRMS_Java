package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Warning")
public class Warning {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String WarningBy;
	private String WarningTo;
	private String Subject;
	private Date WarningDate;
	private String Descripation;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getWarningBy() {
		return WarningBy;
	}
	public void setWarningBy(String warningBy) {
		WarningBy = warningBy;
	}
	public String getWarningTo() {
		return WarningTo;
	}
	public void setWarningTo(String warningTo) {
		WarningTo = warningTo;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public Date getWarningDate() {
		return WarningDate;
	}
	public void setWarningDate(Date warningDate) {
		WarningDate = warningDate;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
	
	

}
