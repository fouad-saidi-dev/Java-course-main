package com.cours.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		System.out.println("------------- ArrayList ---------------");
		
		// creating list using the ArrayList<>()
		List<Integer> numbers = new ArrayList<>();
		
		// add element to the list 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
        System.out.println("List :" +numbers);
        
        //access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed element : "+ number);
	
        // remove element from the list
        int removedNumber = numbers.remove(2);
        System.out.println("Removed element :" + removedNumber);
	
        // verify 
        System.out.println("List :" +numbers);
	
        
        System.out.println("------------- LinkedList ---------------");
	
        //creating list using Linkedlist
        List<String> names = new LinkedList<String>();
        
        // add elements to list
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        
        System.out.println("LinkedList : "+ names);
        
        // Access element from list
        
        String name = names.get(2);
        System.out.println("Accessed element: "+name);
        
        //using the indexOf() method
        int index = names.indexOf("name4");
        System.out.println("Position of name4 :" +index);

        // remove
        String removeString = names.remove(2);
        System.out.println("removed element :" +removeString);
	
	}

}
