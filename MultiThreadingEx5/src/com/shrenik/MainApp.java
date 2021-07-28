package com.shrenik;

import com.shrenik.example.BankTransaction;
import com.shrenik.example.User;

public class MainApp {

	public static void main(String[] args) {
		
		BankTransaction bt = new BankTransaction();

		User u1 = new User(bt, "Smith");
		User u2 = new User(bt, "Peter");
		
		
	
	}
}
