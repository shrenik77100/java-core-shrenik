package com.shrenik.catagory;

import com.shrenik.product.Product;

public class Electronics extends Product {
	
	protected String deviceType;

	public Electronics() {}
	
	public Electronics(String deviceType) {
		super("Electornics");
		this.deviceType = deviceType;
	}
	
	
}
