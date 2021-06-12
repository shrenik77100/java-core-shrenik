package com.shrenik.person;

//Parent Class
public class Person {
	public String fname;
	public String lname;
	public int age;
	public float weight;
	public float height;
	
	public void addPerson(String fname, String lname, int age, float weight, float height)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
}
