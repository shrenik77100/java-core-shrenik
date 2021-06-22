package com.shrenik;

import com.shrenik.example.Animal;
import com.shrenik.example.Bird;
import com.shrenik.example.Fish;

public class MainApp {

	public static void main(String[] args) {
		Fish f = new Animal();
		f.move();
		
		Bird b = new Animal();
		b.move();

	}

}
