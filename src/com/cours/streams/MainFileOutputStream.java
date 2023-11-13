package com.cours.streams;

import java.io.FileOutputStream;

public class MainFileOutputStream {

	public static void main(String[] args) {
		
		String data = "new line FileOutputStream ";
		
		try {
			FileOutputStream out = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Java-course-main\\src\\com\\cours\\streams\\output.txt");
			
			byte[] array = data.getBytes();
			
			out.write(array);
			
			out.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
