package com.shrenik;

import java.util.LinkedList;
import java.util.Queue;

import com.shrenik.example.Customer;

public class MainApp {

	public static void main(String[] args) {
		Queue <Customer>customersQueue = new LinkedList();
		
		customersQueue.add(new Customer("Nikhil", 20));
		customersQueue.add(new Customer("Nitin", 31));
		customersQueue.add(new Customer("Adesh", 55));
		customersQueue.add(new Customer("Yogesh", 27));
		customersQueue.add(new Customer("Chetan", 47));
		
		for(Customer cq : customersQueue)
		{
			System.out.println(cq);
		}
		
		//Processing Queue
		while(customersQueue.isEmpty()==false)
		{
			try {
				Thread.sleep(2000);
				System.out.println("Customer Processed = " + customersQueue.remove());
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("After Processing, Queue Size = " + customersQueue.size());
	}

}
