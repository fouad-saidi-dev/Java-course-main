package com.cours.set;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(7);
		numbers.add(9);

		Iterator<Integer> iterate = numbers.iterator();
		// the next()
		int number = iterate.next();
		System.out.println("Accessed element: " + number);

		// remove
		iterate.remove();
		System.out.println("Removed element: " + number);

		System.out.println("Updated ArrayList :");

		while (iterate.hasNext()) {
           
			iterate.forEachRemaining((value) -> System.out.print(value + ", "));
		}
	}
}
