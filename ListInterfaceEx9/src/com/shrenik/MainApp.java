//Vector-Class in Collection Framework
package com.shrenik;

import java.util.List;
import java.util.Vector;

public class MainApp {

	public static void main(String[] args) {
		Vector numbers = new Vector();
		
		for(int i=101;i<=120;i++)
			numbers.add(i);
		
		System.out.println("Vector Numbers = "+ numbers);

		//remove()
		numbers.remove(4);
		System.out.println("After Remove, Vector Numbers = "+ numbers);
		
		
		//1. addElement()
		Vector cities = new Vector();
		cities.addElement("Delhi");
		cities.addElement("Bangalore");
		cities.addElement("Mumbai");
		
		//2. size()
		System.out.println("Size of Vector  = " + cities.size());
		
		//3. removeElement
		cities.removeElement("Mumbai");
		System.out.println("After removeElement, Vector Cities = " + cities);
		
		//4. removeAllElements()
		cities.removeAllElements();
		System.out.println("After Removing all Elements = " + cities);
		
		
		Vector first = new Vector();
		first.addElement("Hello");
		first.addElement("Welcome");
		
		//5. clone()
		
		Vector second = (Vector)first.clone();
		
		first.addElement("John");
		
		System.out.println(first);
		System.out.println(second);
		
		
		//6. get()
		System.out.println("Value at index 1 in Vector first = " + first.get(1));
		
		
		//7. subList()
		List someNumbers = numbers.subList(3,10);
		System.out.println("someNumbers List = " + someNumbers);
		
		
		
	}

}


// Note: Vector is Synchronized