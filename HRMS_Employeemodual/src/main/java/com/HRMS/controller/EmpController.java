 package com.HRMS.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HRMS.entity.Employee;
import com.HRMS.service.Empservice;
@CrossOrigin(origins="http://Localhost:8080")
@Controller
//@RequestMapping("api//addemp")
public class EmpController {

	@Autowired
     private Empservice service;
	
	
	
	@GetMapping("/")
	public String Home(Model m) {
		
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp); 
		return "Dashboard";
	}
	@GetMapping("/index")
	public String index(Model m) {
		
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp); 
		return "index";
	}
	@GetMapping("/pindex")
	public String pindex(Model m) {
		
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp); 
		return "pindex";
	}
	@GetMapping("/sindex")
	public String sindex(Model m) {
		
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp); 
		return "sindex";
	}
	
	
	@GetMapping("/addemp")
	public String AddEmpForm() {
		return "AddEmp";
	}
	
	@PostMapping("/addemp")
	public String createEmp(@ModelAttribute Employee e,HttpSession session) {
		//System.out.println(e);
		
		service.AddEmp(e);
		session.setAttribute("msg","Employee Add Sucessfully");
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		Employee e=service.getEmpBy(id);
		m.addAttribute("emp",e);
		return "edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session){
		session.setAttribute("msg","Update sucessfully");
		service.AddEmp(e);
		return "redirect:/" ;
	}
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		service.deleteEpm(id);
		session.setAttribute("msg","Delete Sucessfully");
		return "redirect:/";
	}
}
