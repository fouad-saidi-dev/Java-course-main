package com.cours.map;

import java.util.HashMap;

public class Test1HashMap {

	public static void main(String[] args) {
		
		// create an HashMap
		HashMap<String, Integer> prices = new HashMap<>();
		
		// insert
		prices.put("Shoes", 200);
		prices.put("Bag", 300);
		prices.put("Pant", 150);
		System.out.println("HashMap : "+prices);
		
		// recompute the value of shoes with 10% discount
		int newPrice = prices.compute("Shoes", (ke,value) -> value - (value * 10/100));
        System.out.println("Discounted Price of Shoes :" +newPrice);
	}

}
