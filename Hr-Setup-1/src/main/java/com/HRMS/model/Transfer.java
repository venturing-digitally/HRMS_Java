package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transfer")
public class Transfer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String EmployeeName;
	private String Branch;
	private String Department;
	private Date TransferDate;
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
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Date getTransferDate() {
		return TransferDate;
	}
	public void setTransferDate(Date transferDate) {
		TransferDate = transferDate;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
	
	
	
}
