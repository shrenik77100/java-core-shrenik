package com.shrenik;
import java.util.List;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		
		//add()
		numbers.add(19);
		numbers.add(10);
		numbers.add(19);
		numbers.add(49);
		numbers.add(100);
		
		System.out.println("ArrayList numbers = " + numbers);
		
		//size()
		System.out.println("Size of ArrayList =" + numbers.size());
		
		//overloaded version of add()
		numbers.add(1, 199);
		System.out.println("ArrayList numbers after add()= " + numbers);
		
		numbers.set(0, 700);
		System.out.println("ArrayList numbers after set() = " + numbers);
		
		//remove()
		numbers.remove(2);
		System.out.println("ArrayList numbers afer remove() = " + numbers);
		
		//contains()
		System.out.println("Contains() method = " + numbers.contains(100));
		
	}
}
