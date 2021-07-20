package com.shrenik;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int no, d;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number:");
		no = scan.nextInt();
		
		System.out.print("Enter Divisor:");
		d = scan.nextInt();
		
		try
		{
			float ans = no/d;
			System.out.println("Division = " + ans);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			ex.printStackTrace();			
		}
		
		//some-more-lines-of-code
		
		
		System.out.println("~End of Program~");
		
	}

}
