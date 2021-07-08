//Stack Example
package com.shrenik;

import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		//1. push()
		
		s1.push(100);
		s1.push("Welcome");
		s1.push(8.23f);
		s1.push(27);
		s1.push(77);
		
		//2. pop()
		
		s1.pop();
		s1.pop();
		
		//3. isEmpty()
		
		System.out.println("Is stack Empty = " + s1.isEmpty());
		
		System.out.println("Stack  = " + s1);
		
		//4. peek()
		
		System.out.println("Top Element = " + s1.peek());
		
	}

}
