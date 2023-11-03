package com.cours.collections;

import java.util.Iterator;
import java.util.Vector;

public class MainVector {

	public static void main(String[] args) {

       Vector<String> mammals = new Vector<String>();
       
       mammals.add("Dog");
       mammals.add("Horse");
       mammals.add("Horse");
       // using index number
       mammals.add(2,"cat");

       // using get
       String elem = mammals.get(1);
       System.out.println("element at index 1 : "+elem);
       
       // using iterator()
       Iterator<String> iterate = mammals.iterator();
       System.out.println("Vector Iterator: ");
       while (iterate.hasNext()) {
		System.out.println(iterate.next());
		System.out.println(", ");
	}
       
       
       System.out.println("Vector : "+mammals);
       
       // using addAll()
       Vector<String> animals = new Vector<String>();
       animals.add("Corocodile");
       
       animals.addAll(mammals);
       
       System.out.println("new Vector : "+animals);
	}

}
