package Bucles;
import java.util.Scanner;
import java.lang.Math.*;
public class ej15 {

	public static void main(String[] args) {
//		Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por
//		pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No
//		se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar
		
		Scanner sn=new Scanner(System.in);
		int nbase;
		int npotencia;
		System.out.println("escribe un numero para la base");
		nbase= sn.nextInt();
		System.out.println("Escribe un numero para la potencia");
		npotencia= sn.nextInt();
		int mult=1;
		for (int i = 1; i <=npotencia  ; i++) {
			mult= mult *nbase;
			System.out.println("el numero " + nbase + "elevado a "+ i + " es:"+mult);

			
		}
		
		}
	
		
		

	}


