package Bucles;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		

//		Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
//	
		Scanner sn=new Scanner(System.in);
		int num=0;
		int cont = 1; 
		
		System.out.println("Introduce un numero");
		num =sn.nextInt();
		do {
			num=num/10;
			cont= cont +1; 
			System.out.println(cont);

		
		}
		while(num/10 !=0);
	}

}
