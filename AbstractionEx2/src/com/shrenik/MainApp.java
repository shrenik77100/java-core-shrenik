package com.shrenik;

import com.shrenik.example.Animal;
import com.shrenik.example.Bird;
import com.shrenik.example.Dog;
import com.shrenik.example.Fish;

public class MainApp {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Fish();
		animal.move();
		
		animal = new Dog();
		animal.move();
		
		animal = new Bird();
		animal.move();
	}
}
