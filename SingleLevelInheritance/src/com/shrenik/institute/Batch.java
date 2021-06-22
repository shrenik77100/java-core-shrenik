package com.shrenik.institute;

public class Batch {
	
	//default public
	int batchCode;
	String batchTime;
	
	public void addBatch(int batchCode, String batchTime)
	{
		this.batchCode = batchCode;
		this.batchTime = batchTime;
	}
	
	public void showBatch()
	{
		System.out.println("Batch = " + this.batchCode + "\t" + this.batchTime);
	}
}
