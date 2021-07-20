package com.shrenik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int no, d, pos;
		Scanner scan = new Scanner(System.in);
		
		String []users = {"Smith", "John", "Eliz", "Peter", "Nik"};

		try
		{
			System.out.print("Enter Number:");
			no = scan.nextInt();
			
			System.out.print("Enter Divisor:");
			d = scan.nextInt();
			
			float ans = no/d;
			System.out.println("Division = " + ans);
			
			System.out.print("Enter Index number to print username :");
			pos = scan.nextInt();	
			
			System.out.println("User at index " + pos + " = " + users[pos]);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division By zero is not valid");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Index Number must be between 0 and " + users.length);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Input Must be only integer");
		}
		catch(Exception ex)
		{
			System.out.println("Unhandled Exception.");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Finally...");
		}
		
		System.out.println("~End Of Program~");

	}

}
