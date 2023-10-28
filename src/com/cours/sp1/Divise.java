package com.cours.sp1;

public class Divise {

	public static void main(String[] args) {
		
		/*
		 * try { int array[] = new int[10]; array[10] = 30 / 0; } catch
		 * (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		try {
			int array [] = new int[10];
			array[11] = 0 / 3;
		} catch (ArithmeticException e ) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}

	}

}
