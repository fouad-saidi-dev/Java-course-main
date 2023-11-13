package com.cours.streams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainOutputStream {

	public static void main(String[] args) {
		
		String data = "This is a line of text inside the file.";
		
		try {
			OutputStream out = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Java-course-main\\src\\com\\cours\\streams\\output.txt");
			
			// converts the string into bytes 
			byte[] dataBytes = data.getBytes();
			
			// writes data to output stream
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			
			// close the output stream
			out.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
