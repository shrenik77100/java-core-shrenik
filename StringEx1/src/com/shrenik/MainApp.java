package com.shrenik;

public class MainApp {

	public static void main(String[] args) {
		String username = "Smith674";
		System.out.println("Username = " + username);
		
		// 1. toUpperCase()
		String su = username.toUpperCase();
		System.out.println("String in Uppercase  =" + su);
		
		// 2. toLowerCase()
		String sl = username.toLowerCase();
		System.out.println("String in LowerCase = " + sl);
		
		// 3. length()
		int count = username.length();
		System.out.println("String Total Characters = " + count);

	}
}
