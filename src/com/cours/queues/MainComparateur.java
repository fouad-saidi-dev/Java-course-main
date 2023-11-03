package com.cours.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MainComparateur {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
		
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		numbers.add(0);
		numbers.add(5);
		
		
        System.out.println("Priority Queue :" +numbers);
	}

}

class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		int value = number1.compareTo(number2);
		// elements are sorted in reverse order
		if (value > 0) {
			return -1;
		} else if(value < 0){
           return 1;
		} else {
			return 0;
		}
	}
	
}
