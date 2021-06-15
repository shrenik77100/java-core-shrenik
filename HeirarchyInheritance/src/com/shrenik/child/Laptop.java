package com.shrenik.child;

import com.shrenik.catagory.Electronics;

public class Laptop extends Electronics {
	
	private String laptopName;
	private float price;
	
	public Laptop(String laptopName, float price) {
		super("Laptop");
		this.laptopName = laptopName;
		this.price = price;
	}
	
	public void show()
	{
		System.out.println(super.prodCatagory + "\t"  + super.deviceType + "\t" + this.laptopName + "\t" + this.price);
	}	
	
}
