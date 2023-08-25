package com.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeSalary")
public class EmployeeSalary {

	@Id
	private String PaySlipType;
	private String Salary;
	
	
	public EmployeeSalary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPaySlipType() {
		return PaySlipType;
	}
	public void setPaySlipType(String paySlipType) {
		PaySlipType = paySlipType;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSalary [PaySlipType=" + PaySlipType + ", Salary=" + Salary + "]";
	}
	
	
}
