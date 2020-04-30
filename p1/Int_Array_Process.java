package p1;

import java.util.Arrays;

public class Int_Array_Process {
	public int[] arr;
	public Int_Array_Process()
	{
		arr=new int[10];
	}
	public Int_Array_Process(int n)
	{
		arr=new int[n];
	}
	public Int_Array_Process(int[] x)
	{
		arr=new int[x.length];
		for(int i=0;i<x.length;i++)
			arr[i]=x[i];
	}
	public Int_Array_Process(Int_Array_Process a) 
	{
		System.out.println("Copy constructor called");
		this.arr=a.arr;
	}
	public void readData()
	{
		System.out.println("Enter:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Read.br.nextInt();
		}
	}
	public void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public void sort()
	{
		Arrays.sort(arr); 
	}
	public void findingExtremesInArray()
	{
		Arrays.sort(arr);
		System.out.println("Smallest number in array is "+arr[0]);
		System.out.println("Largest number in array is "+arr[arr.length-1]);
	}
    public void getSum()
    {
    	int sum=0;
    	for(int array:arr)
    	{
    		sum+=array;
    	}
    	System.out.println("Sum is "+sum);
    }
}
