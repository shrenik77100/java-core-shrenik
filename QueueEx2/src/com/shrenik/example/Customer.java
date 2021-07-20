package com.shrenik.example;

public class Customer {
	private String custName;
	private int age;
	
	
	public Customer() {}
	
	public Customer(String custName, int age) {
		super();
		this.custName = custName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", age=" + age + "]";
	}

	public String getCustName() {
		return custName;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
