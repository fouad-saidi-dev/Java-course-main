package com.cours.set;

import java.util.EnumSet;

public class MainEnumSet {
	// create enum
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	public static void main(String[] args) {
		// EnumSet does't have a public constructor
        // allOf()
		EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		
		System.out.println("EnumSet : "+sizes);
		
		// noneOf()
		EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
		
		System.out.println("Empty EnumSet: "+sizes1);

		// range(e1,e2)
		EnumSet<Size> sizeRange = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
		System.out.println("EnumSet Range : "+sizeRange);
		
		// of() single or multiple parameters
		EnumSet<Size> sizeOf = EnumSet.of(Size.EXTRALARGE,Size.MEDIUM);
		System.out.println("EnumSet Of : "+sizeOf);
		
		//add() //addAll()
		sizes1.add(Size.MEDIUM);
		System.out.println("Update EnumSet none : "+sizes1);
		
		boolean value = sizes1.contains(Size.MEDIUM);
		System.out.println("Contains ?? "+value);
	}

}
