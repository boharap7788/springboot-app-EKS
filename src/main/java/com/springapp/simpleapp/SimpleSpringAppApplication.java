package com.springapp.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringAppApplication {
	
	@GetMapping("/app/eks")
	public String HelloJava() {
		return "Successfully deployment of Spring Boot Application on EKS !!!!!!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringAppApplication.class, args);
	}
	

	
	
}
