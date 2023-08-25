package com.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import com.HRMS.Service.UserService;
//import com.HRMS.model.UserDetail;
@Controller
public class HomeController {
	
	//private UserService userService;


	@GetMapping("/")
	public String index() {
		return "Index";
	}
	 
	@GetMapping("/Login")
	public String Login() {
		return "Login";
	}
	
	@GetMapping("/Register")
	public String Register(){
		return "Register";
	}
	
	/*@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDetail user) {
	    UserDetail userDetail=userService.createUser(user);
	    if(userDetail!=null) {
	    	System.out.println("Register Sucessfully");
	    }
	    else {
	    	System.out.println("Somethin went Wrong in server");
	    }
		return "redirect:/Register";
		
	}*/
}
