package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Complaints")
public class Complaints {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String ComplaintFrom;
	private String CompalainAgainst;
	private Date ComplaintDate;
	private String Title;
	private String Description;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getComplaintFrom() {
		return ComplaintFrom;
	}
	public void setComplaintFrom(String complaintFrom) {
		ComplaintFrom = complaintFrom;
	}
	public String getCompalainAgainst() {
		return CompalainAgainst;
	}
	public void setCompalainAgainst(String compalainAgainst) {
		CompalainAgainst = compalainAgainst;
	}
	public Date getComplaintDate() {
		return ComplaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
