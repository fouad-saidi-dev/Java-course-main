package com.cours.map;

import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {

	public static void main(String[] args) {
		
		// Creating Map using TreeMap
		Map<String, Integer> values = new TreeMap<String, Integer>();
		
		// insert elements
		values.put("Second", 2);
		values.put("First", 1);
		values.put("Third", 3);
		System.out.println("Map using TreeMap : "+values);
		
		// replace
		values.replace("First",11);
		values.replace("Second",22);
		System.out.println("New Map : "+values);
		

	}

}
