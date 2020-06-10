package com.JavaContainer;

import org.springframework.context.annotation.Bean;

import com.pojo.EmployeePOJO;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {

	@Bean(name="emp1")
	public EmployeePOJO f1() {
		return new EmployeePOJO(1,"raghu","banglore");
	}
	@Bean(name="emp2")
	public EmployeePOJO f2() {
		return new EmployeePOJO(2,"leela","chennai");
	}
	@Bean(name="emp3")
	public EmployeePOJO f3() {
		return new EmployeePOJO(2,"Satya","Vijayawada");
	}




}

    
