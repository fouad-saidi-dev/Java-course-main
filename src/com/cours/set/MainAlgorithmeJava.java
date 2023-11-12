package com.cours.set;

import java.util.ArrayList;
import java.util.Collections;

public class MainAlgorithmeJava {

	public static void main(String[] args) {
		
	  ArrayList<Integer> numbers = new ArrayList<Integer>();
	  numbers.add(2);
	  numbers.add(4);
	  numbers.add(1);
	  numbers.add(6);
	  numbers.add(6);
	  System.out.println("Numbers : "+numbers);

	  // sort() order
	  Collections.sort(numbers);
	  System.out.println("Numbers with order :"+numbers);
	  
	  // shuffle() delete order
	  Collections.shuffle(numbers);
	  System.out.println("Numbers without order : "+numbers);
	 
	  // reverse 
	  Collections.reverse(numbers);
	  System.out.println("reversed numbers : "+numbers);
	
	  // swap()
	  Collections.swap(numbers, 0, 3);
	  System.out.println("Changed position of some numbers : "+numbers);
	
	  // binarySearch
	  int pos = Collections.binarySearch(numbers, 4);
	  System.out.println("The position of 6 is : "+pos);
	  
	  //frequency
	  int count = Collections.frequency(numbers, 6);
	  System.out.println("Count of 6 is : "+count);
	}

}
