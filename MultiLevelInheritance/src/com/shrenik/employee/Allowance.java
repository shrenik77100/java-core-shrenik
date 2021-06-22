package com.shrenik.employee;

public class Allowance extends Employee{
	
	private Employee emp;
	
	public Allowance()
	{
		super.da = 9.5;
		super.hra = 5.0;
	}
	
	public Allowance(Employee emp)
	{
		this();
		this.emp = emp;
	}
	
	public void showEmployee()
	{
		super.da = emp.getSalary()*super.da/100;
		super.hra = emp.getSalary()*super.hra/100;
		super.gross = da + hra + emp.getSalary();
		
		System.out.println("Employee Code = " + emp.getEmpCode());
		System.out.println("Employee Name = " + emp.getEmpName());
		System.out.println("Salary = Rs." + emp.getSalary());
		System.out.println("Dearness Allowance = Rs." + da);
		System.out.println("House Rent Allowance = Rs." + hra);
		System.out.println("Gross Income = Rs." + gross);
	}
}
