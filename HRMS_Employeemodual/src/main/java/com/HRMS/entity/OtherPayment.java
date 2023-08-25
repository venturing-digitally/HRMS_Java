package com.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OtherPayment")
public class OtherPayment {
 
	@Id
	private String Employee;
	private String Tilte;
	private String Type;
	private String Amount;
	private String Action;
	
	
	public OtherPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public String getTilte() {
		return Tilte;
	}
	public void setTilte(String tilte) {
		Tilte = tilte;
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
		return "OtherPayment [Employee=" + Employee + ", Tilte=" + Tilte + ", Type=" + Type + ", Amount=" + Amount
				+ ", Action=" + Action + "]";
	}
	
	
}
