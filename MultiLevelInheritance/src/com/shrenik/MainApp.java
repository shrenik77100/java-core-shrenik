package com.shrenik;

import com.shrenik.employee.Allowance;
import com.shrenik.employee.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		Employee e2 = new Employee(101, "Raj", 8000.00, 8112, "MnfDept");
		Allowance a= new Allowance(e2);
		a.showEmployee();
	}

}
