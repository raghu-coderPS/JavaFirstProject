package com.sapient.shapes;

public class Square{
	int Sides;
	Square()
	{
		
	}
	Square(int Sides)
	{
		this.Sides=Sides;
	}
	public void calculateAreaOfSquare(int Sides)
	{
		System.out.println(Sides*Sides);
	}

}
