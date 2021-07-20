package com.shrenik;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		String []users = {"Smith", "John", "Eliz", "Peter", "Nik"};
		int pos;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Index number to print username :");
		pos = scan.nextInt();
		
		try
		{
			System.out.println("User at index " + pos + " = " + users[pos]);
		}
		catch(Exception ex)
		{
			System.out.println("Exception = " + ex);
			System.out.println("Input Correct array Index");
		}
		
		System.out.println("~End of Program~");

	}

}
