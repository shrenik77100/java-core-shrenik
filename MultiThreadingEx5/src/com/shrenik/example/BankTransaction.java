package com.shrenik.example;

public class BankTransaction{
	
	public double balance = 16000.00;
	public String username;
	
	
	public BankTransaction() {}
	
	public BankTransaction(String username)
	{
		this.username = username;
	}
	
	public void deposit(double amount)
	{
		System.out.println("[" + Thread.currentThread().getName() +"] Processing amount to deposit cash Rs." + amount);
		try {
			Thread.sleep(4000);
		}catch(Exception ex) {}
		balance+=amount;
		
		System.out.println("Hello User. Your updated balance is Rs. "+ balance);
	}
	
	public synchronized void withdraw(double amount)
	{
		if(amount<=balance)
		{
			System.out.println("[" + Thread.currentThread().getName() + "] Processing amount to withdraw cash Rs." + amount);
			try {
				Thread.sleep(4000);
			}catch(Exception ex) {}
			balance-=amount;
			
			System.out.println("Hello User. Your updated balance is Rs. "+ balance);
		}
		else
		{
			System.out.println("Less Balance to withdraw Amount..");		
		}

	}

}
