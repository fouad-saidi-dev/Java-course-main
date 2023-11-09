package com.cours.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainHashSet {

	public static void main(String[] args) {
		// HashSet
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(6);
		numbers.add(4);
		System.out.println("HashSet : "+numbers);

		HashSet<Integer> nbrs = new HashSet<>();
		nbrs.addAll(numbers);
		nbrs.add(5);
		System.out.println("New HashSet : "+nbrs);
		
		// iterator()
		Iterator<Integer> iterate = nbrs.iterator();
		System.out.print("HashSet using Iterator : ");
		// accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		
		System.out.println("/n");
		//remove() removeAll()
		boolean value1 = nbrs.remove(5);
		System.out.println("Update HashSet : "+nbrs);
	
		HashSet<Integer> set1 = new HashSet<>();
	    set1.add(6);
	    set1.add(8);
	    
	    // Intersection of two sets 
	    set1.retainAll(nbrs);
	    System.out.println("Intersection is : "+set1);
		
	}

}
