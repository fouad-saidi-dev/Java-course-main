package com.cours.sp1;

import java.util.Scanner;

public class EX1 {

	
	public static void main(String[] args) {
	
		double prix;
		int qte = 0;
		double total = 0;
		
		while(qte!=-1) {
		System.out.println("Entrer le prix :");
		Scanner sc = new Scanner(System.in);
		prix = sc.nextDouble();
		System.out.println("Entrer la quantite :");
        qte = sc.nextInt();
        System.out.println("le total est :" +qte*prix);
		}
        
	}

}
