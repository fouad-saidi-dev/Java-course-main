package com.cours.streams;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainInputStream {

	public static void main(String[] args) {
		
		byte[] array = new byte[100];
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Java-course-main\\src\\com\\cours\\streams\\input.txt");
			
			System.out.println("Available bytes in the file: "+input.available());
			
			// Read byte from the input stream
			input.read(array);
			System.out.println("Data read from the file: ");
			
			// convert byte array into string
			String data = new String(array);
			System.out.println(data);
			
			// Close the input stream
			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
