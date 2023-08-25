package com.HRMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.entity.Allowence;
import com.HRMS.entity.Commission;
import com.HRMS.entity.EmployeeSalary;
import com.HRMS.entity.Loan;
import com.HRMS.entity.OtherPayment;
import com.HRMS.entity.Overtime;
import com.HRMS.entity.PayRoll;
import com.HRMS.entity.Saturationdeduction;
import com.HRMS.repository.AllowenceRepo;
import com.HRMS.repository.CommissionRepo;
import com.HRMS.repository.EmployeeSalaryRepo;
import com.HRMS.repository.LoanRepo;
import com.HRMS.repository.OtherPaymentRepo;
import com.HRMS.repository.OvertimeRepo;
import com.HRMS.repository.PayRollRepo;
import com.HRMS.repository.SaturationdeductionRepo;    

  
@Service
public class PayRollService {
	@Autowired
	private PayRollRepo repo;
	
	@Autowired
	private AllowenceRepo allow;
	
	@Autowired
	private CommissionRepo commission;
	
	@Autowired
	private EmployeeSalaryRepo esalary;
	
	@Autowired
	private LoanRepo loan;
	
	@Autowired
	private SaturationdeductionRepo sdeduction;
	
	@Autowired
	private OtherPaymentRepo opayment;
	
	@Autowired
	private OvertimeRepo overtime;
	
	
	
	public void AddEmp(PayRoll e,Allowence a) {
		repo.save(e);
		allow.save(a);
		
	}
	
	  public List<PayRoll> getAllEmp(){
		  return repo.findAll();
		  }
	 
	
	//======================================
	
	/*
	 * public void AlowAdd(Allowence a) { allow.save(a); }
	 */
	/*
	 * public List<Allowence> getAllAllowence(){ return allow.findAll(); }
	 */
	//=========================================
	
	public void CommissionAdd(Commission c) {
	     commission.save(c);
	}
	
	public List<Allowence> getAllCommission(){
		return allow.findAll();
	}
	
	//=========================================
	
	public void EmployeeSalaryAdd(EmployeeSalary s) {
	     esalary.save(s);
	}
	
	public List<Allowence> getAllEsalary(){
		return allow.findAll();
	}
	
	//=========================================
	
	public void LoanAdd(Loan l) {
		loan.save(l);
	}
	
	public List<Allowence> getAllLoan(){
		return allow.findAll();
	}
	
	//=========================================
	
	public void DeductionAdd(Saturationdeduction sd) {
		sdeduction.save(sd);
	}
	
	public List<Allowence> getAllDeduction(){
		return allow.findAll();
	}
	
	//=========================================
	
	public void OtherPaymentAdd(OtherPayment op) {
		opayment.save(op);
	}
	
	public List<Allowence> getAllOpayment(){
		return allow.findAll();
	}
	
	//=========================================
	
	public void OvertimeAdd(Overtime o) {
		overtime.save(o);
	}
	
	public List<Allowence> getAlOvertime(){
		return allow.findAll();
	}
	
	//=========================================
	

	
	
	
	
}
