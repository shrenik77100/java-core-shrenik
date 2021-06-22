package com.shrenik.institute;

// You can extend only one class
public class Student extends Course{
	
	// default public
	int rollno;
	String studName;
	
	public void addStudent(int rollno, String studName)
	{
		this.rollno = rollno;
		this.studName = studName;
	}
	
	public int getRollNo()
	{
		return this.rollno;
	}

	public String getStudName()
	{
		return this.studName;
	}
}
