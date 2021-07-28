package com.shrenik.example;

public class TestThread implements Runnable{
	
	private Thread t;
	
	public TestThread(String threadName)
	{
		try
		{
			Thread.sleep(3000);
		}catch(Exception ex) {}
		
		t = new Thread(this, threadName);
		t.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : Hello World");
	}
	
}
