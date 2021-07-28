package com.shrenik.example;

public class User implements Runnable{
	public String username;
	public Thread t;
	BankTransaction BT;
	
	public User() {
		super();
	}
	
	public User(BankTransaction BT , String username)
	{
		this.username = username;
		this.BT = BT;
		
		t = new Thread(this, username);
		t.start();		
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}

	@Override
	public void run() {
		BT.withdraw(15000.00);
	}
	
	
}
