package com.HRMS.model;

import java.util.Date;
import java.util.Locale.IsoCountryCode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Trip")
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String EmployeeName;
	private Date StartDate;
	private Date EndDate;
	private String PurposeOfTrip;
	private  IsoCountryCode Country ;
	private String Descripation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public String getPurposeOfTrip() {
		return PurposeOfTrip;
	}
	public void setPurposeOfTrip(String purposeOfTrip) {
		PurposeOfTrip = purposeOfTrip;
	}
	public IsoCountryCode getCountry() {
		return Country;
	}
	public void setCountry(IsoCountryCode country) {
		Country = country;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
}
