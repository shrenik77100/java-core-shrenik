package com.shrenik;

import com.shrenik.person.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.addPerson("Smith", "Mathew", 28, 60.54f, 5.4f);
		e1.addSalary(40000.00);
		e1.showPerson();

	}
}
