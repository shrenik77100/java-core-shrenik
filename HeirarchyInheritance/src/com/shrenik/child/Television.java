package com.shrenik.child;

import com.shrenik.catagory.Electronics;

public class Television extends Electronics {
	private String deviceName;
	private float price;
	
	public Television() {}
	
	public Television(String deviceName, float price) {
		super("Television");
		this.deviceName = deviceName;
		this.price = price;
	}
	
	public void show()
	{
		System.out.println(super.prodCatagory + "\t"  + super.deviceType + "\t" + this.deviceName + "\t" + this.price);
	}
	
}
