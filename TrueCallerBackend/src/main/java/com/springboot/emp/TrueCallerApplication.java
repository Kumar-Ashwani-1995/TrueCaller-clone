package com.springboot.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrueCallerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TrueCallerApplication.class, args);
		System.out.println("Started");
	}

}
