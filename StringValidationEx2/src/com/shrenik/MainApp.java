package com.shrenik;

import java.util.regex.*;

public class MainApp {

	public static void main(String[] args) {
		String panNumber = "ABCDE134A";
		String regExpr = "[A-Z]{5}\\d{4}[A-Z]";

		
		if(Pattern.matches(regExpr, panNumber))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect");
		}
	}

}
