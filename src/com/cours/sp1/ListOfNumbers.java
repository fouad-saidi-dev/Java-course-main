package com.cours.sp1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ListOfNumbers {

	// create an integer array
	private int [] list = {5, 6, 3, 4, 2};
	
	public void writeList() {
		PrintWriter out = null;
		
		try {
			System.out.println("Entering try statement");
			
			// create a new file 
			out = new PrintWriter(new FileWriter("OutoutFile.txt"));
			
			// writing values from list array to Output.txt
			for (int i = 0; i < 7; i++) {
				out.println("Value at: "+ i + " = " + list[i]);
			}
		} catch (Exception e) {
			System.out.println("Exception => "+ e.getMessage());
		}
		
		finally {
			// checking if PrintWriter has ben opened
			if (out != null) {
				System.out.println("Closing PrintWriter");
				// close PrintWriter
				out.close();
			} else {
                System.out.println("PrintWriter not open");
			}
		}
	}
	
	public static void main(String[] args) {
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();

	}

}
