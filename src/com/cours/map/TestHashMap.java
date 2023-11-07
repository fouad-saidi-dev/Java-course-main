package com.cours.map;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> values = new HashMap<>();
		
		// add mapping to hashMap
		values.put("Two", 2);
		values.put("One", 1);
		
		// create another HashMap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("Three", 3);
		numbers.put("One", 2);
		
		// Add putAll()
		numbers.putAll(values);
		System.out.println("Numbers putAll: " +numbers);
	
		// clone() : copy hashMap
		HashMap<String, Integer> cloneNumbers = (HashMap<String, Integer>) numbers.clone();
		System.out.println("Cloned HashMap :" +cloneNumbers);
		
		// merge(k,v,result)
		int returnValue = cloneNumbers.merge("Foor", 4, (oldValue,newValue) -> oldValue + newValue);
		System.out.println("Value of Foor : "+returnValue);
	    
		System.out.println("Updated :" +cloneNumbers);
		
		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("Brazil", "br");
		countries.put("Morocco", "br");
		countries.put("Spain", "es");
		countries.put("Germany", "Gery");
		System.out.println("HashMap :" +countries);
		
		String return_Value = countries.merge("Morocco", "mor", (oldValue,newValue) -> oldValue + "/" + newValue);
		System.out.println("Morocco : "+return_Value);
		
		System.out.println("Updated HashMap :" +countries);
		
		// merge two hashMap
		HashMap<String, String> cnts = new HashMap<String, String>();
		cnts.put("Germany", "Ger");
		
		// forEach : access each entries of cnts
		// merge() inserts each entry from cnts to countries
		cnts.forEach((ke,value) -> countries.merge(ke, value, (oldValue,newValue) -> {
			
			if (oldValue != newValue) {
				return newValue;
			} else {
                return oldValue;
			}
		}));
		
		System.out.println("Merged HashMap : "+countries);
	
		// iterate through keys only
		System.out.println("Keys : ");
	    for (String key : countries.keySet()) {
			System.out.println(key);
			System.out.println(", ");
		}
	
	}

}
