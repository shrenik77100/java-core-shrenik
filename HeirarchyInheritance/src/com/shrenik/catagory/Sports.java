package com.shrenik.catagory;

import com.shrenik.product.Product;

public class Sports extends Product {
	
	protected String sportType;
	
	public Sports() {}

	public Sports(String sportType) {
		super("Sport");
		this.sportType = sportType;
	}

}
