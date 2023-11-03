package com.cours.map;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> values = new HashMap<>();
		
		// add mapping to hashMap
		values.put("Two", 2);
		values.put("One", 1);
		
		// create another HashMap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("Three", 3);
		
		// Add putAll()
		numbers.putAll(values);
		System.out.println("Numbers : " +numbers);
	}

}
