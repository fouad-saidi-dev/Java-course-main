package com.cours.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {

	public static void main(String[] args) {
		
		SortedSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(2);
		System.out.println("SortedSet : "+numbers);

		// access the first element
		int firstNumber = numbers.first();
		System.out.println("First element : "+firstNumber);
	
		// access the last element
		int lastNumber = numbers.last();
		System.out.println("Last element : "+lastNumber);
		
		// remove
		boolean result = numbers.remove(2);
		System.out.println("Is the number 2 removed? "+result);
	}

}
