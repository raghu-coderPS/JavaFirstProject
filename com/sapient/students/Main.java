package com.sapient.students;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("C:");
		String[] child=dir.list();
		if(child== null)
		{
			
		}
		else
		{
			for(int i=0;i<child.length;i++)
			{
				String filename=child[i];
				System.out.println(filename);
			}
		}

	}

}
