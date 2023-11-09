package com.cours.set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		// add elements
		set1.add(2);
		set1.add(3);
		System.out.println("Set 1 : "+set1 );

		Set<Integer> set2 = new HashSet<>();
		
		//add elements
		set2.add(1);
		set2.add(2);
		System.out.println("Set 2 : "+set2);
		
		//Union of two sets
		set2.addAll(set1);
		System.out.println("Union is : "+set2);
	}

}
