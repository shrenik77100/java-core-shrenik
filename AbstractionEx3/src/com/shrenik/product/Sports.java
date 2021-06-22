package com.shrenik.product;

public abstract class Sports extends Catagory{
	
	protected String sportItem;
	protected int warrenty;
	
	public abstract void createItem(String sportItem, int warrenty);
	public abstract void showItem();
}
