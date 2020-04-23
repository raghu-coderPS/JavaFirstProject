package com.sapient.shapes;

public class Shapes
{
	public int numberOfSides;
	public int sideLength;
	void setLength(int sideLength)
	{
		this.sideLength=sideLength;
	}
	void setSides(int numberOfSides)
	{
		this.numberOfSides=numberOfSides;
	}
	int getLength()
	{
		return sideLength;
	}
	int getSides()
	{
		return numberOfSides;
	}
	void calculateShapeArea(int numberOfSides,int sideLength)
	{
		switch(numberOfSides)
		{
		 case 1:
				{
					System.out.print("The area of Circle is ");
					Circle circle = new Circle(sideLength);
					circle.calculateAreaOfCircle(sideLength);
					break;
				}
		 case 3:
				{
					System.out.print("The area of Triangle is ");
					Triangle triangle = new Triangle(sideLength);
					triangle.calculateAreaOfTriangle(sideLength);
					break;
				}
		 case 4:
				{
					Square square = new Square(sideLength);
					System.out.print("The area of Square is ");
					square.calculateAreaOfSquare(sideLength);
					break;
				}
         default:
				{
					System.out.println("No Shapes Present");
					break;
				}
		}
	}
	
    
}
