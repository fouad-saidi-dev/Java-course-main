package com.cours.collections;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {

       Stack<String> animals = new Stack<String>();
       
       // add
       animals.add("cat");
       animals.add("dog");
       animals.add("hara");
       animals.add("elem1");
       animals.add("elem2");
       // add element to stack
       
       animals.push("elem3");
       animals.push("elem4");
       
       System.out.println("Stack :" + animals);

       // access element from the top 
       String elm = animals.peek();
       System.out.println("Element at top: "+elm);
       
       // search
       int pos = animals.search("elem3");
       System.out.println("Position :" +pos);
       
       // isEmpty
       Boolean result = animals.empty();
       System.out.println("Is empty ? " +result);
       
       // delete 
       //String element = animals.pop();
       //System.out.println("Removed Elment : "+element);
	}

}
