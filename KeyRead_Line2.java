package com.sapient.shapes;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	public int n;
	public int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	public int[] a;
	Scanner s = new Scanner(System.in);
	void Read()
	{
		System.out.println("Enter n value:");
	    int b=s.nextInt();
		this.n=b; 
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
	}
	void display()
	{ 
		
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	     System.out.println();  
	}
	void sort()
	{
		Arrays.sort(a); 
		System.out.printf("Sorted array is : %s", Arrays.toString(a)); 
		System.out.println();
	}
	void search(int Value)
	{
		boolean test = false; 
        for (int element : a) { 
            if (element == Value) { 
                test = true; 
                break; 
            } 
        } 
        if(test==true)
            System.out.println(Value + " is present in the array");
        else
        	System.out.println(Value + " is not present in the array");
	}
}
