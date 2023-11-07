package com.cours.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MainSortedMap {

	public static void main(String[] args) {
		
		// creating SortedMap using TreeMap
		SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();
		
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("Three", 3);
		System.out.println("SortedMap :" +numbers);

		// firstKey
		System.out.println("First Key :" +numbers.firstKey());
	
		// lastKey
		System.out.println("Last Key :" +numbers.lastKey());
	
		// headMap(key)
		System.out.println("Keys small than Three :" +numbers.headMap("Three"));
		
		// tailMap(key)
		System.out.println("Keys bigger than Three :" +numbers.tailMap("Three"));
	
		// subMap(key) => between
		System.out.println("Keys betweem 1 and 2 :" +numbers.subMap("One","Two"));
	}

}
