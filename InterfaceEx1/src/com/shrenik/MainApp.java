package com.shrenik;

import com.shrenik.example.Car;
import com.shrenik.example.Insuarance;
import com.shrenik.example.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		// 1. Directly create object of child class
			Car c1 = new Car();
			c1.changeSpeed();
			c1.applyBreaks();
			c1.changeGear();
			c1.isEligible(true);
			
		// 2. Use polymorphism
			Vehicle veh;
			
			veh = new Car();
			veh.changeSpeed();
			veh.applyBreaks();
			veh.changeGear();
			
			
			Insuarance in;
			in = new Car();
			in.isEligible(false);		
	}
}
