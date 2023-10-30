package com.cours.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX1 {

	static int[] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };

	static int division(int indice, int diviseur) {
		return tableau[indice] / diviseur;
	}

	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Entrez l’indice de l’entier à diviser: ");
			x = scan.nextInt();
			System.out.println("Entrez le diviseur: ");
			y = scan.nextInt();
			System.out.println("Le résultat de la division est: ");
			System.out.println(division(x, y));
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException => "+e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException => "+e.getMessage());
		}

	}

}
