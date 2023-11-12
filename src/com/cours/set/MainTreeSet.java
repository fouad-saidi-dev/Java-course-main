package com.cours.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(6);
		System.out.println("TreeSet : "+numbers);

		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("TreeSet using Iterator :");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println();
		// tailSet
		System.out.println("nbr sup a 3 ou egal "+numbers.tailSet(3));
		System.out.println("nbr sup a 3 "+numbers.tailSet(3,false));
		// headSet 
		System.out.println("nbr inf a 3  "+numbers.headSet(3));
		System.out.println("nbr inf a 3  "+numbers.headSet(3,false));
		// subSet
		System.out.println(numbers.subSet(2, 6));
	    System.out.println(numbers.subSet(2,false, 6,true));
	}
	
	public static class CustomComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer nbr1, Integer nbr2) {
			
			int nbr = nbr1.compareTo(nbr2);
			
			// elements are sorted in reverse order
			if (nbr > 0) {
				return -1;
			} else if (nbr< 0) {
				return 1;
			} else 
			return 0;
		}

		

		

		
		
	}

}
