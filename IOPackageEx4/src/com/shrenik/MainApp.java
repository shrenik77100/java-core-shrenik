/* WAP to demonstrate Console Class */

package com.shrenik;

import java.io.Console;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException {
		//to read encrypted Characters
		Console c = System.console();
		
		System.out.print("\n Enter Password :");
		char arr[] = c.readPassword();
		
		String obj = new String(arr);
		System.out.println("Decrypted Password = " + obj);

	}
}
