package com.shrenik;

import com.shrenik.child.CloudEngineer;
import com.shrenik.child.Developer;
import com.shrenik.child.Tester;
import com.shrenik.parent.Employee;

public class MainApp {

	public static void main(String[] args) {
		Employee emp;
		
		//Parent Class Reference
		emp = new Employee();
		emp.completeJob("Parent Class Reference");
		
		//Child Class Reference
		emp = new Developer(); 
		emp.completeJob("Child Class Developer");
		
		emp = new Tester();
		emp.completeJob("Child Class Tester");
		
		emp = new CloudEngineer();
		emp.completeJob("Child Class CloudEngineer");
	}

}
