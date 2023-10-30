package com.cours.annotations;

import java.util.ArrayList;

public class Atlas {

	@SuppressWarnings("unchecked")
	static void wordsList() {

		ArrayList wordList = new ArrayList<>();

		// this causes an unchecked warning
		wordList.add("fouad");

		System.out.println("Word list => " + wordList);
	}

	/*
	 * 
	 * 1. Annotations prédéfinies
	 * 
	 * @Deprecated
	 * 
	 * @Override
	 * 
	 * @SuppressWarnings
	 * 
	 * @SafeVarargs
	 * 
	 * @FunctionalInterface
	 * 
	 * 3. Méta-annotations
	 * 
	 * @Retention
	 * 
	 * @Documented
	 * 
	 * @Target
	 * 
	 * @Inherited
	 * 
	 * @Repeatable
	 */

	public static void main(String[] args) {

		wordsList();

	}

}
