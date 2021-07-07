package com.shrenik;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List coursesList = new LinkedList();
		
		coursesList.add("Python");
		coursesList.add("Java");
		coursesList.add("Ruby");
		coursesList.add("Swing");
		
		coursesList.add(1, "SQL");
		coursesList.set(0, "HTML");
		
		coursesList.remove(2);
		
		Collections.sort(coursesList);
		System.out.println("LinkedList courses = " + coursesList);
		
		//study data structures topic of resizable array * doubly-linked-list
	}
}
