package com.sapient.students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public int id;
    public int noOfStudents;
    public String name;
    public String city;
    List<Student> stu=new ArrayList<Student>();
    Scanner br=new Scanner(System.in);
    
   public Student()
    {
	   this.noOfStudents=1;
    }
   public Student(int noOfStudents)
   {
   	this.noOfStudents=noOfStudents;
   }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    public void readStudent()
    {
    	Student s[]=new Student[this.noOfStudents];
    	for(int i=0;i<noOfStudents;i++) {
    		s[i]=new Student();
    	System.out.println("Enter Student"+i+" id:");
    	int a=br.nextInt();
    	System.out.println("Enter Student"+i+" name:");
    	String s1=br.next();
    	System.out.println("Enter Student"+i+" city:");
    	String s2=br.next();
    	s[i].setCity(s2);
    	s[i].setId(a);
    	s[i].setName(s1);
    	stu.add(s[i]);
    	}
    }
    void displayStudent()
    {
    	ListIterator<Student> listItr=(ListIterator<Student>)stu.listIterator();
    	while(listItr.hasNext())
    	{
    		Student stud=(Student)listItr.next();
    		System.out.print(stud);
    	}
    	System.out.println();
    }
    void displayStudentBelongsToCity(String city)
    {
    	ListIterator<Student> listItr=(ListIterator<Student>)stu.listIterator();
    	while(listItr.hasNext())
    	{
    		Student stud=(Student)listItr.next();
    		if(stud.getCity().equals(city))
    		{
    		System.out.print(stud);
    		}
    	
    	}
    	System.out.println();
    }
    void displayNameWiseSorted()
    {
    	HashMap<String,Student>hm= new HashMap<>();
    	ListIterator<Student> listItr=(ListIterator<Student>)stu.listIterator();
    	while(listItr.hasNext())
    	{
    		Student stud=(Student)listItr.next();
    		hm.put(stud.getName(),stud);
    	}
    	Map<String,Student> map=new TreeMap<String,Student>(hm); 
    	Set<Entry<String, Student>> set=map.entrySet();
    	Iterator<Entry<String, Student>> iterator=set.iterator();
    	while(iterator.hasNext())
    	{
    		Map.Entry<String, Student> me=(Map.Entry<String, Student>)iterator.next();
    		System.out.print(me.getValue());
    	}
    	System.out.println();
    }
    void displayCityWiseSorted()
    {
    	HashMap<String,Student>hm= new HashMap<>();
    	ListIterator<Student> listItr=(ListIterator<Student>)stu.listIterator();
    	while(listItr.hasNext())
    	{
    		Student stud=(Student)listItr.next();
    		hm.put(stud.getCity(),stud);
    	}
    	Map<String,Student> map=new TreeMap<String,Student>(hm); 
    	Set<Entry<String, Student>> set=map.entrySet();
    	Iterator<Entry<String, Student>> iterator=set.iterator();
    	while(iterator.hasNext())
    	{
    		Map.Entry<String, Student> me=(Map.Entry<String, Student>)iterator.next();
    		System.out.print(me.getValue());
    	}
    	System.out.println();
    }
    public String toString()
    {
		return ("["+id+","+name+","+city+"]");
    	
    }
    public Student find(int id) throws StudentNotFoundException
    {
    	if(id>0)
    	{
    		return new Student();
    	}
    	else
    	{
    		throw new StudentNotFoundException("Could not find student with ID "+id);
    	}
    }
   public static void main(String[] args)
   {
	   Student student= new Student(1);
	   student.setId(-1);
	   try {
		   Student student1=student.find(student.getId());
		   System.out.println(student1.id);
	   }catch(StudentNotFoundException ex) {
		   ex.printStackTrace();
	   }
   }
    
}
