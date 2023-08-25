package com.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SaturationDeduction")
public class Saturationdeduction {
  
	@Id
	private String EmployeeName;
	private String Deductionoption;
	private String Title;
	private String Type;
	private String Amount;
	private String Action;
	
	
	public Saturationdeduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDeductionoption() {
		return Deductionoption;
	}
	public void setDeductionoption(String deductionoption) {
		Deductionoption = deductionoption;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	@Override
	public String toString() {
		return "Saturationdeduction [EmployeeName=" + EmployeeName + ", Deductionoption=" + Deductionoption + ", Title="
				+ Title + ", Type=" + Type + ", Amount=" + Amount + ", Action=" + Action + "]";
	}
	
	
	
}
