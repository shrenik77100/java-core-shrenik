package com.shrenik;

import com.shrenik.example.Car;
import com.shrenik.example.Ford;

public class MainApp {

	public static void main(String[] args) {
		//Method 1 -> Creating Child class Object
		Ford f = new Ford();
		f.accelerateCar();
		f.stopCar();
		
		//Method 2 -> Using Polymorphism
		Car c;
		c = new Ford();
		
		c.accelerateCar();
		c.stopCar();
		
	}

}
