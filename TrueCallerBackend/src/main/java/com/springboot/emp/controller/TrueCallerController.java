package com.springboot.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.emp.controller.service.TrueCallerService;
import com.springboot.emp.entity.User;

@RestController
public class TrueCallerController {

	@Autowired
	TrueCallerService trueCallerService;
	
	@GetMapping("/search/{phoneNo}")
	public String SearchEmployes(@PathVariable("phoneNo") long phoneNo) {
		User user = this.trueCallerService.getPhoneNoOfUser(phoneNo);
		if (user!=null) {
		return user.getName()+ "--------> spam reported "+ user.getSpamCount() ;
		}
		return phoneNo +"not found";
	}
}
