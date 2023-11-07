package com.cours.map;

import java.util.EnumMap;

public class MainEnumMap {
   
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	public static void main(String[] args) {
	
		EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
		
		//put
		sizes.put(Size.SMALL, 28);
		sizes.put(Size.MEDIUM, 32);
		sizes.put(Size.LARGE, 36);
		System.out.println("EnumMap : "+sizes);
		
		
}
}
