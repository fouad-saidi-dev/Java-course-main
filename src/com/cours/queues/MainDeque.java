package com.cours.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {

	public static void main(String[] args) {
		
		// ArrayDeque
		Deque<Integer> numbers = new ArrayDeque<>();
		
		// offer
		numbers.offer(1);
		numbers.offerFirst(2);
		numbers.offerLast(3);
		numbers.addFirst(0);
		System.out.println("Deque :" +numbers);

		// access
		int firstNumber = numbers.peekFirst();
		System.out.println("Fisrt element :" +firstNumber);
		
		int lastNumber = numbers.peekLast();
		System.out.println("Last element :" +lastNumber);
		
        // remove
		int remeveNumber1 = numbers.pollFirst();
		System.out.println("remove first elem :" +remeveNumber1);
		
		int remeveNumber2 = numbers.pollLast();
		System.out.println("remove last elem :" +remeveNumber2);
	}

}
