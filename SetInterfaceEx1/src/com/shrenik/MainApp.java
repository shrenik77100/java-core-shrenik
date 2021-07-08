//HashSet
package com.shrenik;

import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(10);
		s.add(-56);
		s.add(100);
		
		System.out.println("HashSet Object =" + s);

	}

}
