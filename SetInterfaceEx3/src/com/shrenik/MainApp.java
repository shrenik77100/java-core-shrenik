package com.shrenik;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		Set hash = new HashSet();
		
		hash.add("Smith");
		hash.add("SMITH");
		hash.add("John");
		hash.add("Peter");
		hash.add("PEter");
		
		System.out.println("Hashset = " + hash);
		
		Set linkedhash = new LinkedHashSet();
		linkedhash.add("India");
		linkedhash.add("Austrellia");
		linkedhash.add("USA");
		linkedhash.add("usa");
		linkedhash.add("UK");
		
		System.out.println("Linked Hash Set = " + linkedhash);
		
		Set tree = new TreeSet();
		tree.add(18);
		tree.add(92);
		tree.add(19);
		tree.add(1);
		tree.add(10);
		
		System.out.println("TreeSet = " + tree);

	}

}
