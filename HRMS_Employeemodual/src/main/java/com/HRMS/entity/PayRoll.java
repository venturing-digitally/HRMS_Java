package com.HRMS.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PayRoll")
public class PayRoll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployeeId;
	private String Name;
	private String PayRollType;
	private String Salary;
	private String NetSalary;
	private String PayslipType;
	
	
	
	public PayRoll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPayRollType() {
		return PayRollType;
	}
	public void setPayRollType(String payRollType) {
		PayRollType = payRollType;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getNetSalary() {
		return NetSalary;
	}
	public void setNetSalary(String netSalary) {
		NetSalary = netSalary;
	}
	public String getPayslipType() {
		return PayslipType;
	}
	public void setPayslipType(String payslipType) {
		PayslipType = payslipType;
	}
	@Override
	public String toString() {
		return "PayRoll [EmployeeId=" + EmployeeId + ", Name=" + Name + ", PayRollType=" + PayRollType + ", Salary="
				+ Salary + ", NetSalary=" + NetSalary + ", PayslipType=" + PayslipType + "]";
	}
	

	
	
	
	

	
}
