package com.shrenik.child;

import com.shrenik.parent.Employee;

public class Developer extends Employee{

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is now Developer. " + msg);
	}
	
}
