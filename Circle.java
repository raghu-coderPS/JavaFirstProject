package com.sapient.shapes;

public class Circle{
	public int Radius;
	Circle()
	{
	
	}
	Circle(int Radius)
	{
	  this.Radius=Radius;	
	}
	void calculateAreaOfCircle(int Radius)
	{
		System.out.println(3.14*Radius*Radius);
	}

}
