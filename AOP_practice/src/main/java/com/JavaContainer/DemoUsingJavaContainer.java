package com.JavaContainer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojo.EmployeePOJO;

public class DemoUsingJavaContainer{

	public static void main(String[] args) {
		   ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaContainer.class);

		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter id:");
			int id = scan.nextInt();

	        if(id<4) {
			EmployeePOJO ob1 = context1.getBean("emp"+id,EmployeePOJO.class);
			System.out.println(ob1.toString());
			}
	        else
	        {
		System.out.println("Employee not found");
		    }

	}

}


