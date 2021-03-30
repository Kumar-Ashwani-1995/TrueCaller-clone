package com.springboot.emp.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.emp.controller.service.dao.TrueCallerRepository;
import com.springboot.emp.entity.User;


@Service
public class TrueCallerService {

	@Autowired
	TrueCallerRepository trueCallerRepository;
	
	public User getPhoneNoOfUser(long phoneNo) {
		User user = null;
		try {
			user = this.trueCallerRepository.findByPhoneNumber(phoneNo);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return user;
	}
	public User saveUser(User user) {
		return this.trueCallerRepository.save(user);
		
	}
}
