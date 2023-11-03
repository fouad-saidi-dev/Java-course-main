package com.cours.queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
   public static void main(String[] args) {
	
	   // LinkedList 
	   Queue<Integer> numbers = new LinkedList<>();
	   
	   // offer elements to the queue 
	   numbers.offer(1);
	   numbers.offer(2);
	   numbers.offer(3);
	   numbers.offer(4);
	   
	   System.out.println("Queue : "+numbers);
	   
	   // access elements of the queue
	   int accessNumber = numbers.peek();
	   System.out.println("Accessed element :"+accessNumber);
	   
	   // poll supprime
	   int deletedNumber = numbers.poll();
	   System.out.println("Deleted element :" +deletedNumber);
	   
	   
	   // PriorityQueue
	   
	   Queue<Integer> nbs = new PriorityQueue<>();
	   
	   // offer
	   nbs.offer(5);
	   nbs.offer(1);
	   nbs.offer(3);
	   
	   System.out.println("Queue Priopirity :"+nbs);
	   
	   // access 
	   int accessnbr = nbs.peek();
	   System.out.println("Accessed element :" +accessnbr);
	   
	   // remove
	   int removeNumber = nbs.poll();
	   System.out.println("Removed :" +removeNumber);
}
}
