package com.cours.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MainNavigableSet {

	public static void main(String[] args) {
		
		NavigableSet<Integer> numbers = new TreeSet<Integer>();
		
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		
		System.out.println("NavigableSet : "+numbers);
		
		// descendant
		System.out.println("Inverse NavigableSet : "+numbers.descendingSet());
		
		// ceilling
		int ceillNumber = numbers.ceiling(5);
		System.out.println("element plus bas parmi n >= 5 : "+ceillNumber);

		// floor
		int floorNumber = numbers.floor(5);
		System.out.println("element plus grand parmi n <= 5 : "+floorNumber);

		// higher
		int higherNumber = numbers.higher(3);
		System.out.println("strictement ceill : "+higherNumber);
		
		// lower
		int lowerNumber = numbers.lower(3);
		System.out.println("strictement floor : "+lowerNumber);
				
		// pollFirst
		int removedNumber = numbers.pollFirst();
		System.out.println("first element deleted : "+removedNumber);

		// pollFirst
				int deletedNumber = numbers.pollLast();
				System.out.println("last element deleted : "+deletedNumber);
	}

}
