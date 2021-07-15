package com.shrenik;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainApp {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put("+91", "India");
		m1.put("+1", "US");
		m1.put("+43", "UK");
		m1.put("+241", "UAE");
		m1.put("+91", "India");
		
		System.out.println("HashMap m1 = " + m1);
		
		Map m2 = new LinkedHashMap();
		
		m2.put(38713, "Yuvraj Sing");
		m2.put(38811, "Sachin Tendulkar");
		m2.put(28842, "Mahendrasing Dhoni");
		m2.put(38713, "Yuvraj Sing");
		
		System.out.println("Linked HashMap m2 = " + m2);
		
		
		Map m3 = new TreeMap();
		m3.put(77, "Smith");
		m3.put(27, "Peter");
		m3.put(27, "Arjun");
		m3.put(10, "John");
		m3.put(18, "Eliz");
		
		System.out.println("Tree Map m3 = " + m3);

	}

}
