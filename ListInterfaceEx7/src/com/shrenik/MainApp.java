//Comparator Interface

package com.shrenik;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.shrenik.example.Employee;

public class MainApp {

	public static void main(String[] args) {
		List <Employee>empList = Arrays.asList(
				new Employee(193, "Peter", 19000.00),
				new Employee(531, "John", 11000.00),
				new Employee(244, "Mathew", 23000.00),
				new Employee(432, "Smith", 20000.00),
				new Employee(421, "Eliz", 13000.00)
		);
		
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.empCode > e2.empCode)
					return 1;
				else if(e1.empCode < e2.empCode)
					return -1;
				else
					return 0;
			}
			
		});
		
		System.out.println("Employee List after sorting using Comparator,");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}

	}

}





