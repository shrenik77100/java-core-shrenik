package com.shrenik.employee;

import com.shrenik.department.Department;

public class Employee extends Department {
	
	private int empCode;
	private String empName;
	private double salary;
	
	protected double da, hra, gross;
	
	public Employee()
	{
		this.empCode = -1;
		this.empName = "#UnknownEmpName";
		this.salary = -1;
	}

	//Alt + Shift + S -> O
	public Employee(int empCode, String empName, double salary, int deptCode, String deptName) {
		super(deptCode, deptName);
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}

	//Alt + Shift + S -> R
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
