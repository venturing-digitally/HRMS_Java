package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Resignation")
public class Resignation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String EmployeeName;
	private Date ResignationDate;
	private Date LastWorkingDate;
	private String Reason;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Date getResignationDate() {
		return ResignationDate;
	}
	public void setResignationDate(Date resignationDate) {
		ResignationDate = resignationDate;
	}
	public Date getLastWorkingDate() {
		return LastWorkingDate;
	}
	public void setLastWorkingDate(Date lastWorkingDate) {
		LastWorkingDate = lastWorkingDate;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	
}
