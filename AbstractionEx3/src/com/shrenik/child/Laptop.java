package com.shrenik.child;

import com.shrenik.product.Electronics;

public class Laptop extends Electronics{
	
	public Laptop() {}
	
	public Laptop(String prodName, float price)
	{
		super(prodName, price);
	}

	@Override
	public float purchaseProduct(int qtys) {
		return super.price*qtys;
	}

	@Override
	public float applyDiscount(float amount) {
		return this.purchaseProduct(3) - amount;
	}

	@Override
	public void defineCatagory(String catagoryCode, String catagoryName) {
		super.catagoryCode = catagoryCode;
		super.catagoryName = catagoryName;		
	}

}
