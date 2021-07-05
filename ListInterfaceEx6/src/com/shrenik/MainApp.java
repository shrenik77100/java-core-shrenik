package com.shrenik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.shrenik.example.Author;

public class MainApp {

	public static void main(String[] args) {
		List <Author>authorsList = Arrays.asList(
				new Author("Johnson", 24),
				new Author("Jsmith", 100),
				new Author("Kanetkar", 119),
				new Author("Gosling", 57),
				new Author("Peter", 18)				
		); 
		
		Collections.sort(authorsList);
		
		System.out.println("Authors List Details");
		for(Author a:authorsList)
		{
			System.out.println(a);
		}
	}

}
