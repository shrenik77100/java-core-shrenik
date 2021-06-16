package com.shrenik.child;

import com.shrenik.parent.Employee;

public class Tester extends Employee{

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is now Tester. " + msg);
	}

}
