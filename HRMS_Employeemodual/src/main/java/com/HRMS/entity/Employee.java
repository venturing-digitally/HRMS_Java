package com.HRMS.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Personal Details
	private int id;
 private String Name;
 private String PhoneNo;
 private String Date_of_Birth;
 private String Gender;
 private String Email;
 private String Password;
 private String Address;
 
    //Company Detail

 private String SelectBranch;
 private String Department;
 private String SelectDesignation;
 private String CompanyDateOfJoining;
 
 //Bank Account Detail
 
 private String AccountHolderName;
 private String AccountNumber;
 private String BankName;
 private String BankIdentifierCode;
 private String BranchLocation;
 private String TaxPayerId;
 
 
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
}
public String getDate_of_Birth() {
	return Date_of_Birth;
}
public void setDate_of_Birth(String date_of_Birth) {
	Date_of_Birth = date_of_Birth;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getSelectBranch() {
	return SelectBranch;
}
public void setSelectBranch(String selectBranch) {
	SelectBranch = selectBranch;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getSelectDesignation() {
	return SelectDesignation;
}
public void setSelectDesignation(String selectDesignation) {
	SelectDesignation = selectDesignation;
}
public String getCompanyDateOfJoining() {
	return CompanyDateOfJoining;
}
public void setCompanyDateOfJoining(String companyDateOfJoining) {
	CompanyDateOfJoining = companyDateOfJoining;
}
public String getAccountHolderName() {
	return AccountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	AccountHolderName = accountHolderName;
}
public String getAccountNumber() {
	return AccountNumber;
}
public void setAccountNumber(String accountNumber) {
	AccountNumber = accountNumber;
}
public String getBankName() {
	return BankName;
}
public void setBankName(String bankName) {
	BankName = bankName;
}
public String getBankIdentifierCode() {
	return BankIdentifierCode;
}
public void setBankIdentifierCode(String bankIdentifierCode) {
	BankIdentifierCode = bankIdentifierCode;
}
public String getBranchLocation() {
	return BranchLocation;
}
public void setBranchLocation(String branchLocation) {
	BranchLocation = branchLocation;
}
public String getTaxPayerId() {
	return TaxPayerId;
}
public void setTaxPayerId(String taxPayerId) {
	TaxPayerId = taxPayerId;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", PhoneNo=" + PhoneNo + ", Date_of_Birth=" + Date_of_Birth
			+ ", Gender=" + Gender + ", Email=" + Email + ", Password=" + Password + ", Address=" + Address
			+ ", SelectBranch=" + SelectBranch + ", Department=" + Department + ", SelectDesignation="
			+ SelectDesignation + ", CompanyDateOfJoining=" + CompanyDateOfJoining + ", AccountHolderName="
			+ AccountHolderName + ", AccountNumber=" + AccountNumber + ", BankName=" + BankName
			+ ", BankIdentifierCode=" + BankIdentifierCode + ", BranchLocation=" + BranchLocation + ", TaxPayerId="
			+ TaxPayerId + "]";
}
 

 
 
 
 
	
}
