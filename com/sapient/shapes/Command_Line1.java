package com.sapient.shapes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Command_Line1 {
	public int n;
	public int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	public int[] a;
	Scanner s = new Scanner(System.in);
	Command_Line1()
	{
	
	}
	void setData()
	{
		System.out.println("Enter n value:");
	    int a=s.nextInt();
		this.n=a; 
	}
	void callData()
	{ 
		a=new int[n];
		 System.out.println("Start entering numbers:");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();
			    
		 }
		 for(int i=0;i<n;i++)
			{
				sum=sum+a[i];
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
			}
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(this.a[i]+" ");
		 }
	     System.out.println();  
	}
	void displayData()
	{
		double average = (double)sum /(double) n;
		BigDecimal value = new BigDecimal(average);
		System.out.println("Sum is "+sum);
		System.out.println("largest is "+max);
		System.out.println("Smallest is "+min);
		System.out.println("Average is "+value);
		
	}

}
