package com.cours.map;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
		
		// creating a map using the HashMap
		Map<String,Integer> numbers = new HashMap<>();
		
		// insert elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println("Map :" +numbers);
		
		// access keys of the map
		System.out.println("Keys : "+numbers.keySet());
		
		//access values of the map
		System.out.println("Values :" +numbers.values());
		
		// access entries of the map
		System.out.println("Entries :" +numbers.entrySet());
		
		// get return value
		int accessNumber = numbers.get("One");
		System.out.println("Value of Key One : "+accessNumber);
		
		// containKey -- verify key exist
		Boolean isExist = numbers.containsKey("Two");
		System.out.println("Is Exist ? " +isExist);
		
		// remove(k) remove(k,v)
		int deletedNumber = numbers.remove("Three");
		System.out.println("delete value:" +deletedNumber);
		
		
		
		
		

	}

}
