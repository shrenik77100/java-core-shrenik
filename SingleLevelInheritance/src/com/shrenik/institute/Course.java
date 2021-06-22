package com.shrenik.institute;

public class Course {
	
	public int courseCode;
	public String courseName;
	public float fees;
	
	public void addCourse(int courseCode, String courseName, float fees)
	{
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.fees = fees;
	}
	
	public void showCourse()
	{
		System.out.println("Course = " + this.courseCode + "\t" + this.courseName + "\t" + this.fees);
	}
}
