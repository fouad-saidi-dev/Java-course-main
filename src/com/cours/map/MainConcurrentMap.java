package com.cours.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MainConcurrentMap {

	public static void main(String[] args) {
		// creating ConcurrentMap
		ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

		// insert element
		numbers.put("One", 1);
		numbers.put("Three", 3);
		numbers.put("Two", 2);
		System.out.println("Concurrent Map :" + numbers);

		// access the value get("One")
		int value = numbers.get("One");
		System.out.println("Accessd Value :" + value);

		// forEach without transformer function
		numbers.forEach((k, v) -> System.out.println("Key : " + k + " value : " + v));


		HashMap<String, Integer> notes = new HashMap<String, Integer>();

		notes.put("Fouad", 10);
		notes.put("Mohammed", 14);
		notes.put("Reda", 17);

		System.out.println("HashMap : " + notes);

		// iterate
		Iterator<String> iterate = numbers.keySet().iterator();

		// iterate for notes
		Iterator<String> iterateNote = notes.keySet().iterator();

		// In HashMap : can not insert new value when program compile
		/*
		 * while (iterateNote.hasNext()) { String key = iterateNote.next(); if
		 * ("Mohammed".equals(key)) { numbers.put("Ahmed", 12); } }
		 */
		while (iterate.hasNext()) {
			String key = iterate.next();
			if ("Three".equals(key)) {
				numbers.put("Four", 4);
			}
		}
		System.out.println("New ConcurrentMap : " + numbers);

	}

}
