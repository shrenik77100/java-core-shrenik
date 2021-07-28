package com.shrenik;

import java.util.ArrayList;

import com.shrenik.example.Player;

public class MainApp {

	public static void main(String[] args) {
		ArrayList <Player>team1 = new ArrayList();
		
		team1.add(new Player(201, "Smith"));
		team1.add(new Player(201, "John"));
		team1.add(new Player(201, "Peter"));
		team1.add(new Player(201, "Manish"));
		
		ArrayList <Player>team2 = new ArrayList();
		
		team1.add(new Player(1451, "Praneet"));
		team1.add(new Player(1452, "Yash"));
		team1.add(new Player(1453, "Sachin"));
		team1.add(new Player(1454, "Virat"));
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				for(int i=0;i<team1.size();i++)
				{
					try {
						Thread.sleep(2000);
					}catch(Exception ex) {}
					
					Player p = team1.get(i);
					p.start();
				}
			}
			
		};
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				for(int i=0;i<team2.size();i++)
				{
					try {
						Thread.sleep(2000);
					}catch(Exception ex) {}
					
					Player p = team2.get(i);
					p.start();
				}
			}
			
		};		
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
				
		

	}

}
