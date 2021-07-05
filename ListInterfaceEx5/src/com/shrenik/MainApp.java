/* Sorting List Interface Collection Items */

package com.shrenik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.shrenik.example.Movie;

public class MainApp {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.add(81);
		numbers.add(18);
		numbers.add(27);
		numbers.add(37);
		numbers.add(30);
		
		//Note: "Collection" is Interface and "Collections" is a class
		Collections.sort(numbers);
		
		System.out.println("ArrayList Numbers after sorting,");
		System.out.println(numbers);
		
		List cities = Arrays.asList("California", "London", "Delhi", "Bangalore", "Chennai", "Pune");
		
		Collections.sort(cities);
		System.out.println("ArrayList Cities after sorting,");
		System.out.println(cities);	
		
		ArrayList <Movie>movieList = new ArrayList();
		
		movieList.add(new Movie("Life of Pi", 5));
		movieList.add(new Movie("Harry Potter", 4));
		movieList.add(new Movie("Prince of Persia", 3));
		movieList.add(new Movie("Jurasic Park", 5));
		movieList.add(new Movie("Night in the Musium", 4));
		
		System.out.println("ArrayList Movies List");
		for(Movie m:movieList)
		{
			System.out.println(m);
		}
		
		//sort movieList in Acending order orderby rating
		Collections.sort(movieList);
		
		System.out.println("ArrayList Movies List after Sorting...");
		for(Movie m:movieList)
		{
			System.out.println(m);
		}		

	}

}
