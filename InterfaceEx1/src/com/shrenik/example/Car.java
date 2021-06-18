package com.shrenik.example;

public class Car implements Vehicle, Insuarance {

	@Override
	public void changeSpeed() {
		System.out.println("Car is now going fast..");
	}

	@Override
	public void changeGear() {
		System.out.println("Car changed Gear.");
	}

	@Override
	public void applyBreaks() {
		System.out.println("Car will stop in few seconds.");
	}

	@Override
	public void isEligible(boolean status) {
		System.out.println("Is Car Eligible for Insuarance:" + status);
	}
	
}
