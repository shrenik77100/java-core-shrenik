package com.shrenik;

import com.shrenik.institute.Student;

public class MainApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.addCourse(193, "Android App Developer", 19000.00f);
		s1.addStudent(18, "Smith");
		
		s1.showCourse();
		System.out.println("Roll Number = " + s1.getRollNo() + "\t Student Name = " + s1.getStudName());

	}

}
