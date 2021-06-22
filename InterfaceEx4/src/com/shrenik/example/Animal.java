package com.shrenik.example;

public class Animal implements Bird, Fish{

	@Override
	public void move() {
		// It is common implementation for Bird and Fish
		System.out.println("bird and Fish Common implementation by Animal Class");
	}

}
