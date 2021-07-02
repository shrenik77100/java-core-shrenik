package com.shrenik;
import java.util.ArrayList;

import com.shrenik.example.Product; 

public class MainApp {
	public static void main(String []args) {
		ArrayList <Product>productsList = new ArrayList();
		
		productsList.add(new Product(101, "Monitor", 10000.00f));
		productsList.add(new Product(184, "Mouse", 500.00f));
		productsList.add(new Product(382, "Keyboard", 1400.00f));
		productsList.add(new Product(392, "SMPS", 700.00f));
		
		//count of products
		System.out.println("Total Number of Products =" + productsList.size());
		
		//print all products
		System.out.println("Using toString() method of ArrayList class");
		System.out.println(productsList);
		
		System.out.println("Using index for loop");
		for(int i=0;i<productsList.size();i++)
		{
			System.out.println(productsList.get(i));
		}
		
		System.out.println("Using Enhanced Fop Loop");
		for(Product p:productsList)
		{
			System.out.println(p);
		}
		
		
	}
}
