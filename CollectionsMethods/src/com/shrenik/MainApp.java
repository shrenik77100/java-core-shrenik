package com.shrenik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List numbersList = Arrays.asList(19,34,25,12,59,32);
		
		//1. sort
		Collections.sort(numbersList);
		System.out.println("List of Numbers in Ascending Order = " + numbersList);
		
		//2. binarySearch
		int position = Collections.binarySearch(numbersList, 100);
		System.out.println("Position of item 100 in numbersList = " + position);
		
		//3. reverse
		Collections.reverse(numbersList);
		System.out.println("Reverse of numbersList = " + numbersList);

		//4. swap
		Collections.swap(numbersList, 2, 4);
		System.out.println("After Swapping 2 and 4 positions = " + numbersList);
		
		//5. fill
		ArrayList <Float>emptyList = new ArrayList();
		emptyList.add(1.1f);
		emptyList.add(2.1f);
		
		Collections.fill(emptyList, 56.90f);
		System.out.println("emptyList after Collectsions.fill = " + emptyList);
		
		//6. shuffle
		Collections.shuffle(numbersList);
		System.out.println("Shuffle of numberList = " + numbersList);
		
		Object []myarray = numbersList.toArray();
		
		System.out.println("NumbersList Converting to type Array");
		for(Object r:myarray)
		{
			System.out.println(r);
		}
		
		
		
		

	}

}
