package com.cours.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		
		// creating arrayList of even numbers
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		evenNumbers.add(2);
		evenNumbers.add(1);
		evenNumbers.add(3);
		System.out.println("ArrayList : "+evenNumbers);
		
		// creating linkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
		System.out.println("LinkedHashSet : "+numbers);
	
		Iterator<Integer> iterate = numbers.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println();
		LinkedHashSet<Integer> cloneNumbers = (LinkedHashSet<Integer>) numbers.clone();
		System.out.println("Copy of LinkedHashList is :"+cloneNumbers);
	
		// size
		System.out.println("Size :" +cloneNumbers.size());
		
		// isEmpty
		boolean isEmpty = cloneNumbers.isEmpty();
		System.out.println("It's empty : "+isEmpty);
	
		// contains
		boolean value = cloneNumbers.contains(2);
		System.out.println("2 its exist ? "+value);
		
		// containsAll
		boolean isExist = cloneNumbers.containsAll(numbers);
		System.out.println("All elements are exist ? "+isExist);
		
	}

}
