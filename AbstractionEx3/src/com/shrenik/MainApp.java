package com.shrenik;

import com.shrenik.child.Laptop;

public class MainApp {

	public static void main(String[] args) {
		Laptop prod1 = new Laptop("Hp Pavillion", 60000.00f);
		prod1.defineCatagory("CN889", "Electronics");
		float totalBill = prod1.applyDiscount(3000.00f);
		
		System.out.println("Total Payble Amount = Rs." + totalBill);
	}

}
