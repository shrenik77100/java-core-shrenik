package com.shrenik;

import com.shrenik.child.Circle;
import com.shrenik.child.Square;
import com.shrenik.child.Triangle;
import com.shrenik.parent.Shape;

public class MainApp {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Shape();
		shape.calculateArea();
		
		shape = new Circle();
		shape.calculateArea();
		
		shape = new Triangle();
		shape.calculateArea();
		
		shape = new Square();
		shape.calculateArea();
		
	}

}
