package com.shrenik;

import com.shrenik.example.Employee;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 18000.00f);
		Employee e2 = new Employee(183, "Peter", 27000.00f);
		Employee e3 = new Employee(483, "Mathew", 15000.00f);
		Employee e4 = new Employee(293, "Eliz", 16000.00f);
		
		ArrayList <Employee>empList = new ArrayList();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e1);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("Using Enhanced For Loop, Employees are");
		for(Employee e:empList)
		{
			System.out.println(e);
		}
		
		//contains
		int pos=-1;
		for(int i=0;i<empList.size();i++)
		{
			if(empList.get(i).getEmpName().equals("Mathew"))
			{
				pos=i;
			}
		}
		
		if(pos==-1)
		{
			System.out.println("Employee not Exist");
		}
		else
		{
			System.out.println("Employee Found");
			System.out.println(empList.get(pos));
		}
	
	}

}
