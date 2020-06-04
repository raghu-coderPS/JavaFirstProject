package com.JavaContainer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojo.EmployeePOJO;

public class Demonstration {

	public static void main(String[] args) {
		   ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaContainer.class);

		   Scanner scan = new Scanner(System.in);
			int id = scan.nextInt();
			System.out.println(id);
	        if(id<3) {
			EmployeePOJO ob1 = context1.getBean("e"+id,EmployeePOJO.class);
			System.out.println(ob1.toString());
			}
	        else
	        {
		System.out.println("Employee not found");
		    }

	}

}
