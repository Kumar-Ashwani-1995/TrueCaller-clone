package com.springboot.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.emp.controller.service.TrueCallerService;
import com.springboot.emp.entity.User;

@RestController
public class TrueCallerController {

	@Autowired
	TrueCallerService trueCallerService;
	
	@GetMapping("/search/{phoneNo}")
	public User SearchPhoneNumber(@PathVariable("phoneNo") long phoneNo) {
		User user = this.trueCallerService.getPhoneNoOfUser(phoneNo);
		if (user!=null) {
		//return user.getName()+ "--------> spam reported "+ user.getSpamCount() ;
			return user;
		}
		//return phoneNo +"not found";
		return user;
	}
	
	@PutMapping("/spam")
	public String MarkSpam(@RequestBody User usr) {
		User user1=this.trueCallerService.getPhoneNoOfUser(usr.getPhoneNumber());
		user1.setSpamCount(String.valueOf(Integer.parseInt(user1.getSpamCount())+1));
		this.trueCallerService.saveUser(user1);
		return usr.getName()+" is now added as spam";
	}
	
	@PostMapping("/addContact")
	public String importContact(@RequestBody User usr) {
		if (this.trueCallerService.getPhoneNoOfUser(usr.getPhoneNumber()) == null) {
			this.trueCallerService.saveUser(usr);
			return usr.getName()+" is now added added";
		}
		
		return usr.getPhoneNumber()+" is already added";
	}
}
