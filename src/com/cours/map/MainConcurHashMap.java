package com.cours.map;

import java.util.concurrent.ConcurrentHashMap;

public class MainConcurHashMap {

	public static void main(String[] args) {

       ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<String, Integer>();
       
       numbers.put("Three", 3);
       numbers.put("Four", 4);
       numbers.put("One", 1);
       numbers.put("Two", 2);
       System.out.println("Concurrent Hash Map : "+numbers);
	   
       // forEach()
       numbers.forEach(4, (k,v) -> System.out.println("Key :"+k+ "Value : " +v));
       
       //search()
       String key = numbers.search(4, (k,v) -> {return v == 3 ? k : null ;});
       System.out.println("Searched value : " +key);
	
       // reduce()
       int sum = numbers.reduce(4, (k,v) -> v, (v1,v2) -> v1 + v2);
       System.out.println("La somme de tout les values :" +sum);
	
	}

}
