package com.HRMS.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.HRMS.entity.Allowence;
import com.HRMS.entity.Commission;
import com.HRMS.entity.Loan;
import com.HRMS.entity.OtherPayment;
import com.HRMS.entity.Overtime;
import com.HRMS.entity.PayRoll;
import com.HRMS.entity.Saturationdeduction;
import com.HRMS.service.PayRollService;


@Controller
public class PayRollController {
	@Autowired
	private PayRollService service;
	

	/*
	 * @GetMapping("/pindex") public String Homee(){ return "pindex"; }
	 */
	@GetMapping("/view")
	public String view(Model m) {
		List<PayRoll> emp = service.getAllEmp();
		m.addAttribute("emp", emp);
		return "view";
	}

	// Employee Salary
	@GetMapping("/sadd")
	public String sadd() {
		return "sadd";
	}

	@PostMapping("/salaryAdd")
	public String salaryadd(@ModelAttribute PayRoll e, HttpSession session) {
		// System.out.println(e);
		service.AddEmp(e);
		session.setAttribute("msg", "Employee Add Sucessfully");
		return "redirect:/";

	}

	// Allowence
	@GetMapping("/aadd")
	public String aadd() {
		return "aadd";
	}

	
	  @PostMapping("/AlowAdd") public String Allowence(@ModelAttribute Allowence e,HttpSession session) { 
		  service.AlowAdd(e); session.setAttribute("msg",
	  "Allowence Add Sucessfully"); return "redirect:/";
	  
	 }
	 

	// Commission
	@GetMapping("/cadd")
	public String cadd() {
		return "cadd";
	}

	@PostMapping("/CommissionAdd")
	public String Commission(@ModelAttribute Commission c, HttpSession session) {
		service.CommissionAdd(c);
		session.setAttribute("msg", "Commission Add Sucessfully");
		return "redirect:/";

	}

	// Loan
	@GetMapping("/ladd")
	public String ladd() {
		return "ladd";
	}

	@PostMapping("/LoanAdd")
	public String Loan(@ModelAttribute Loan l, HttpSession session) {
		service.LoanAdd(l);
		session.setAttribute("msg", "Commission Add Sucessfully");
		return "redirect:/";

	}

	// Saturation Deduction
	@GetMapping("/sdadd")
	public String sdadd() {
		return "sdadd";
	}

	@PostMapping("/DeductionAdd")
	public String Deduction(@ModelAttribute Saturationdeduction e, HttpSession session) {
		service.DeductionAdd(e);
		session.setAttribute("msg", "Commission Add Sucessfully");
		return "redirect:/";

	}

	
	/*
	 * //Other Payment
	 * 
	 * @GetMapping("/sdadd") public String sdadd() { return "sdadd"; }
	 */
	 

	// Overtime
	@GetMapping("/oradd")
	public String oradd() {
		return "oradd";
	}

	@PostMapping("/OvertimeAdd")
	public String OtherPayment(@ModelAttribute OtherPayment e, HttpSession session) {
		service.OtherPaymentAdd(e);
		session.setAttribute("msg", "Commission Add Sucessfully");
		return "redirect:/";

	}

	// OtherPayment
	@GetMapping("/oadd")
	public String oadd() {
		return "oadd";
	}

	@PostMapping("/OtherpaymentAdd")
	public String Overtime(@ModelAttribute Overtime e, HttpSession session) {
		service.OvertimeAdd(e);
		session.setAttribute("msg", "Commission Add Sucessfully");
		return "redirect:/";

	}

}
