package com.shrenik;

public class MainApp {
	
	public static void main(String []args)
	{
		StringBuilder sb1 = new StringBuilder("Java developed by James Gosling.");
		
		System.out.println("String Builder Test Object = " + sb1);
		
		//1. append
		sb1.append("Newest Version of Java is 16");
		
		System.out.println("After append(), sb1 = " + sb1);
		
		
		//2. insert
		sb1.insert(10, "It is OOP Language");
		System.out.println("After insert, sb1 = " + sb1);
		
		//3. delete
		sb1.delete(1, 20);
		System.out.println("After Delete, sb1 = " + sb1);
		
		
		//4. length
		//5. capacity
		//6. indexOf
		//7. trimToSize
		//8. substring
		//9. codePointAt
		
	}
}
