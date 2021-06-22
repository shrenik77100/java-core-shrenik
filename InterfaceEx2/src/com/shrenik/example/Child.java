package com.shrenik.example;

public class Child implements Third{

	@Override
	public void showFirst() {
		System.out.println("First Implemented...");
	}

	@Override
	public void showSecond() {
		System.out.println("Second Implemented...");		
	}

	@Override
	public void showThird() {
		System.out.println("Third Implemented...");		
	}

}
