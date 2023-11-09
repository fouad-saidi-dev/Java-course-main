package com.cours.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		
		// creating arrayList of even numbers
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		evenNumbers.add(2);
		evenNumbers.add(1);
		evenNumbers.add(3);
		evenNumbers.add(null);
		System.out.println("ArrayList : "+evenNumbers);
		
		// creating linkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
		System.out.println("LinkedHashSet : "+numbers);
	}

}
