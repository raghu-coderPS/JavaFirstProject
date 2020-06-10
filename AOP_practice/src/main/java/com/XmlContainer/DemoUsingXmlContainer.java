package com.XmlContainer;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.EmployeePOJO;


public class DemoUsingXmlContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = scan.nextInt();

		if(id<4) {
		EmployeePOJO ob = (EmployeePOJO) context.getBean("emp"+id);
		System.out.println(ob.toString());
		}
		else
		{
			System.out.println("Employee not found");
		}


	}




}

    
