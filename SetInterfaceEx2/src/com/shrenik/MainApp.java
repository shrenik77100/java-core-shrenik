// Adding Custom Class Objects in HashSet
package com.shrenik;

import java.util.HashSet;
import java.util.Set;

import com.shrenik.example.Player;

public class MainApp {

	public static void main(String[] args) {
		Set <Player>players = new HashSet();
		
		
		players.add(new Player());
		players.add(new Player(101, "Yuvraj", 90));
		players.add(new Player(102, "Virat", 181));
		players.add(new Player(103, "Sachin", 100));
		
		System.out.println("Using toString,");
		System.out.println(players);
		
		System.out.println("Using Enhanced Loop,");
		for(Player p:players)
		{
			System.out.println(p);
		}
		
		
		
		// HashSet			-> Order is by hash-code
		
		// LinkedHashSet	-> Order is by Insertion-Order
		
		// TreeSet			-> order is ascending / Sorted-Order

	}

}
