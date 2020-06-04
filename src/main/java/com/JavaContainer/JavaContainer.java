package com.JavaContainer;

import org.springframework.context.annotation.Bean;

import com.pojo.EmployeePOJO;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {

	@Bean(name="e1")
	public EmployeePOJO f1() {
		return new EmployeePOJO(1,"sai","banglore");
	}
	@Bean(name="e2")
	public EmployeePOJO f2() {
		return new EmployeePOJO(2,"manoj","chennai");
	}




}
