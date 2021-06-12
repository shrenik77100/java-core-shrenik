package com.shrenik.person;


// Child-Class
public class Employee extends Person{
	public double salary;
	
	public void addSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void showPerson()
	{
		System.out.println("Employee : " + super.fname + "\t" + super.lname + "\t" + super.age + "\t" + super.weight + "\t" + super.height);
		System.out.println("Salary : Rs." + this.salary);
	}
}
