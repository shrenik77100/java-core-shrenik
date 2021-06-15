package com.shrenik.product;

public class Product {
	protected String prodCatagory;

	public Product() {}
	
	public Product(String prodCatagory)
	{
		this.prodCatagory = prodCatagory;
	}
}

//If child-class object created then it also calls default-constructor of parent-class

