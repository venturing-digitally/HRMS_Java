package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Promotion")
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
    private String EmployeeName;
    private String Designation;
    private String PromotionTitle;
    private Date PromotionDate;
    private String Descripation;
    
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
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getPromotionTitle() {
		return PromotionTitle;
	}
	public void setPromotionTitle(String promotionTitle) {
		PromotionTitle = promotionTitle;
	}
	public Date getPromotionDate() {
		return PromotionDate;
	}
	public void setPromotionDate(Date promotionDate) {
		PromotionDate = promotionDate;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
    

}
