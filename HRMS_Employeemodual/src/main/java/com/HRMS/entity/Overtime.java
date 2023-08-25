package com.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Overtime")
public class Overtime {

	@Id
	private String EmployeeName;
	private String OvertimeTitle;
	private String NumberOfDays;
	private String Hours;
	private String Rate;
	private String Action;
	
	
	public Overtime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getOvertimeTitle() {
		return OvertimeTitle;
	}
	public void setOvertimeTitle(String overtimeTitle) {
		OvertimeTitle = overtimeTitle;
	}
	public String getNumberOfDays() {
		return NumberOfDays;
	}
	public void setNumberOfDays(String numberOfDays) {
		NumberOfDays = numberOfDays;
	}
	public String getHours() {
		return Hours;
	}
	public void setHours(String hours) {
		Hours = hours;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	@Override
	public String toString() {
		return "Overtime [EmployeeName=" + EmployeeName + ", OvertimeTitle=" + OvertimeTitle + ", NumberOfDays="
				+ NumberOfDays + ", Hours=" + Hours + ", Rate=" + Rate + ", Action=" + Action + "]";
	}
	
	
	
}
