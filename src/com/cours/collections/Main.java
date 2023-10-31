package com.cours.collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// class fournit la fonctionalite de tableaux redimentionnables
		ArrayList<String> animals = new ArrayList<>();
		
		// add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        
        System.out.println("ArrayList : "+ animals);
	}

}
