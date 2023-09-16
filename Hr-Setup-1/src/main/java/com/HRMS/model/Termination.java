package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Termination")
public class Termination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String EmployeeName;
	private String TerminationType;
	private Date TerminationDate;
	private Date NoticeDate;
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
	public String getTerminationType() {
		return TerminationType;
	}
	public void setTerminationType(String terminationType) {
		TerminationType = terminationType;
	}
	public Date getTerminationDate() {
		return TerminationDate;
	}
	public void setTerminationDate(Date terminationDate) {
		TerminationDate = terminationDate;
	}
	public Date getNoticeDate() {
		return NoticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		NoticeDate = noticeDate;
	}
	public String getDescripation() {
		return Descripation;
	}
	public void setDescripation(String descripation) {
		Descripation = descripation;
	}
	

}
