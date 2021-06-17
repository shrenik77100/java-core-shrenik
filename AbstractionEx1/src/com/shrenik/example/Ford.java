package com.shrenik.example;

public class Ford extends Car{

	@Override
	public void accelerateCar() {
		super.status = "Car is moving ahead";
		System.out.println(super.status);
	}

	@Override
	public void stopCar() {
		super.status = "Car now will stop";
		System.out.println(super.status);
	}	
}
