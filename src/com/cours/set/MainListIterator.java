package com.cours.set;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainListIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		System.out.println("Array list: "+numbers);
		
		
		ListIterator<Integer> iterate = numbers.listIterator();
		// next
		int number = iterate.next();
		System.out.println("Accessed to : "+number);

		// nextIndex
		int index1 = iterate.nextIndex();
		System.out.println("Position of next element: "+index1);
	
		// next
		int number1 = iterate.next();
		System.out.println("Accessed to : "+number1);
		
		// nextIndex
		int index2 = iterate.nextIndex();
		System.out.println("Position of next element: "+index2);

		// hasNext
		System.out.println("Is there any next element ? "+iterate.hasNext());
	
		// previous
		int number2 = iterate.previous();
		System.out.println("Previous element: "+number2);
		
		// previousIndex
		int index3 = iterate.previousIndex();
		System.out.println("Position of previous element: "+index3);

	}

}
