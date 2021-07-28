package com.shrenik.example;

public class Player extends Thread{
	public int playerCode;
	public String playerName;	
	
	public Player() {}
	
	public Player(int playerCode, String playerName) {
		super(playerName);
		this.playerCode = playerCode;
		this.playerName = playerName;
	}

	@Override
	public void run() {
		for(int i=1;i<=1000;i+=200)
		{
			System.out.println(Thread.currentThread().getName() + " Covered total " + i + "meter race");
		}
	}	
}
