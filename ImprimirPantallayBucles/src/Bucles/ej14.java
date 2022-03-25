package Bucles;

import java.lang.Math;
import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
//		Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
		Scanner sn=new Scanner(System.in);
		int base;
		int exponente;
		
		System.out.println("Escribe una base");
		base = sn.nextInt();
		
		System.out.println("Escribe la potencia");
		exponente = sn.nextInt();
		
		System.out.println(Math.pow(base, exponente));
		

	}

}
