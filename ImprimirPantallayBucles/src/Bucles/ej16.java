package Bucles;
import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
//		Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es
//		aquel que sólo es divisible entre él mismo y la unidad.
		Scanner sn=new Scanner(System.in);

		int n ;
		int resto = 0;
		int cont = 0; 
		System.out.println("introduce un numero para saber si es primo o no ");
		n= sn.nextInt();
		for (int i = 1; i <= n; i++) {
			resto = n % i ;
			if (resto == 0) {
				cont = cont + 1;
			}
		}
		if (cont == 2) {
			System.out.println("el numero es primo");
		
		}else {
			if (cont != 2) {
				System.out.println("el numero no es primo");
			}
					
		}
			
		}


		
		
			
		

	}


