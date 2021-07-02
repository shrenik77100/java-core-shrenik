package com.shrenik.example;

public class Employee {
	private int empCode;
	private String empName;
	private double salary;
	
	
	public Employee()
	{
		this.empCode = -1;
		this.empName = "#UnknownEmpName";
		this.salary = -1.0f;
	}
	
	public Employee(int empCode, String empName, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%10d %20s %10.2f", this.empCode, this.empName, this.salary);
	}

	public int getEmpCode() {
		return empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}
	
	
	
	
	
}
