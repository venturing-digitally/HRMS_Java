package com.HRMS.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Award")
public class Award {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Employee;
	private String AwardType;
	private String Gift;
	private String Date;
	private String Descripation;
	
	
	
	
	public Award() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public String getAwardType() {
		return AwardType;
	}
	public void setAwardType(String awardType) {
		AwardType = awardType;
	}
	public String getGift() {
		return Gift;
	}
	public void setGift(String gift) {
		Gift = gift;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
	@Override
	public String toString() {
		return "Award [Id=" + Id + ", Employee=" + Employee + ", AwardType=" + AwardType + ", Gift=" + Gift + ", Date="
				+ Date + ", Descripation=" + Descripation + "]";
	}
	
	
	

	


}
