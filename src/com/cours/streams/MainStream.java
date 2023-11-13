package com.cours.streams;

import java.io.IOException;

public class MainStream {

	public static void main(String[] args) {
		// standard output stream
		System.out.println("hello");
		// standard input stream
		try {
			int i = System.in.read();
			System.out.println("You typed : "+(char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// standard error stream
		System.err.println("An error");

	}

}
