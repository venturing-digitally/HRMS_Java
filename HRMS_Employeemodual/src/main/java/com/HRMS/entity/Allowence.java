package com.HRMS.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Allowence")
public class Allowence{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String EmployeeName;
	private String Allowenceoptions;
	private String Title;
	private String Type;
	private String Amount;
	private String Action;
	
	
	public Allowence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getAllowenceoptions() {
		return Allowenceoptions;
	}
	public void setAllowenceoptions(String allowenceoptions) {
		Allowenceoptions = allowenceoptions;
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
		return "Allovence [EmployeeName=" + EmployeeName + ", Allowenceoptions=" + Allowenceoptions + ", Title=" + Title
				+ ", Type=" + Type + ", Amount=" + Amount + ", Action=" + Action + "]";
	}
	
	
}
