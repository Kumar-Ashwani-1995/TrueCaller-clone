package com.springboot.emp.controller.service.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.emp.entity.User;

public interface TrueCallerRepository extends CrudRepository<User, String>{
	@Query("select u from User u where u.phoneNumber =:n")
	public User findByPhoneNumber(@Param("n") long phoneNo);
}
