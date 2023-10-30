package com.cours.exeptions;

public class Assertion {

	public static void main(String[] args) {
     
		String[] weekends = {"Friday","Sunday","Monday"};
		assert weekends.length == 2 : "There are only 2 weekends in a week";
		System.out.println("there are "+weekends.length + "  weekends in a week");

	}

}
