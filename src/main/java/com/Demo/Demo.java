package com.demo;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JavaContainer.JavaContainer;
import com.pojo.EmployeePOJO;


public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");

		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		System.out.println(id);

		if(id<3) {
		EmployeePOJO ob = (EmployeePOJO) context.getBean("e"+id);
		System.out.println(ob.toString());
		}
		else
		{
			System.out.println("Employee not found");
		}


	}




}
