package com.shrenik;

public class MainApp {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				//task1
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {}
				
				System.out.println("Hello Thread 1");
			}
			
		};
		

		Thread t2 = new Thread() {

			@Override
			public void run() {
				//task2
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {}		
				
				System.out.println("Hello Thread 2");
			}
			
		};

		Thread t3 = new Thread() {

			@Override
			public void run() {
				//task3
				for(int i=1;i<=10;i++)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}			
					
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();


	}

}
