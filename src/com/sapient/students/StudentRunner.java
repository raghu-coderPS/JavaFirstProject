package com.sapient.students;

public class StudentRunner {

	public static void main(String[] args) {
		Student s=new Student();
		s.readStudent();
		s.displayStudent();
		s.displayStudentBelongsToCity("BVRM");
        s.displayNameWiseSorted();
		s.displayCityWiseSorted();
	}

}
