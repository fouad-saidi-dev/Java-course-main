package com.cours.map;

import java.util.TreeMap;

public class MainTestTree {

	public static void main(String[] args) {

		// order croissant
        TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();
        
        numbers.put("One", 1);
        numbers.put("Three", 3);
        numbers.put("Two", 2);
 
        // getOrDefault()
        int value = numbers.getOrDefault("Four", 4);
        System.out.println("Using getOrDefault() :" +value);

        System.out.println("TreeMap "+numbers);
        
        // firstKey()
        String firstKey = numbers.firstKey();
        System.out.println("Fisrt elem : "+firstKey);
        
        // firstEntry()
        System.out.println("First Entry :" +numbers.firstEntry());
	}

}
