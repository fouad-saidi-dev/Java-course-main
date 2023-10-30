package com.cours.exeptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ressourc {

	public static void main(String[] args) {
		// try with resource
		
		/*
		 * String line; try(BufferedReader br = new BufferedReader(new
		 * FileReader("test.txt"))) { while ((line = br.readLine()) != null) {
		 * System.out.println("Line =>"+line); } }catch (IOException e) {
		 * System.out.println("IOException in try block =>"+e.getMessage()); }
		 */
		
		// block finally
		
		BufferedReader br = null;
		String line;
		
		try {
			System.out.println("Entring try block");
			br = new BufferedReader(new FileReader("test.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println("Line =>"+line);
			}
		} catch (IOException e) {
			System.out.println("IOException in try block =>"+e.getMessage());
		} finally {
			System.out.println("Entering finally block");
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e2) {
				System.out.println("IOException in finally block =>"+e2.getMessage());
			}
		}
	}

}
