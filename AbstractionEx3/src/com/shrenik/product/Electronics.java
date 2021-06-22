package com.shrenik.product;

public abstract class Electronics extends Catagory{
	//1. if abstract class extends another abstract class then optionally can override parent class abstract methods
	
	protected String prodName;
	protected float price;
	
	public Electronics()
	{
		prodName = "#unknownProdName";
		price = 0.0f;
	}

	public Electronics(String prodName, float price) {
		super();
		this.prodName = prodName;
		this.price = price;
	}
	
	public abstract float purchaseProduct(int qtys);
	public abstract float applyDiscount(float amount);	
}
