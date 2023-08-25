package com.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loan")
public class Loan {

	@Id
	private String Employee;
    private String LoanOption;
    private String Title;
    private String Type;
    private String LoanAmount;
    private String Action;
    
    
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	public String getLoanOption() {
		return LoanOption;
	}
	public void setLoanOption(String loanOption) {
		LoanOption = loanOption;
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
	public String getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		LoanAmount = loanAmount;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	@Override
	public String toString() {
		return "Loan [Employee=" + Employee + ", LoanOption=" + LoanOption + ", Title=" + Title + ", Type=" + Type
				+ ", LoanAmount=" + LoanAmount + ", Action=" + Action + "]";
	}


}
