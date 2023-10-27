package com.cours.sp1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainException1 {

	public static void diviseByZero() {
		// 3 . java throw and throws
		//throw an exception
	    throw new ArithmeticException("Trying to divise by 0");
	}
	
	//declare type of exception
	public static void findFile() throws IOException {
		
		//code that may generate IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		/*
		 * 1 . Java try...catch bloc
		 * 
		 * try { int diviseByZero = 5 / 0;
		 * System.out.println("Rest of code in try block"); } catch (ArithmeticException
		 * e) { System.out.println("ArithmeticException => "+e.getMessage()); }
		 */

		// 2 . java finally block
		/*
		 * try { 
		 * int diviseByZero = 5 / 0; 
		 * } catch (ArithmeticException e) {
		 * System.out.println("ArithmeticException => "+e.getMessage()); 
		 * } finally {
		 * System.out.println("this is the finally block"); }
		 */
		//diviseByZero();

		try {
			findFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
