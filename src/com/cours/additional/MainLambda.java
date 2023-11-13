package com.cours.additional;

interface MyInterface {

	// abstract method
	double getPiValue();
}
@FunctionalInterface
interface MyIntf {
	String reverse(String n);
}

public class MainLambda {

	public static void main(String[] args) {

		// declare reference to MyInterface
		MyInterface ref;

		// lambda expression
		ref = () -> 3.1415;

		System.out.println("Value of Pi = " + ref.getPiValue());

		MyIntf fac = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Lambda reversed = " +fac.reverse("Lambda"));

	}

}
