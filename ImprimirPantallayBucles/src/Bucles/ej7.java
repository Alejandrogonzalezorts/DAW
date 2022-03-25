package Bucles;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		// TODO Auto-generated method stub
		int cont = 1234;
		int num = 0;
		
		do {
			System.out.println("Introduce la contraseña");
			num =sn.nextInt();
			if (num==cont) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
			else if  (num!=cont) { System.out.println("“Lo siento, esa no es la\n" + 
					"combinación");
			}
		}while(num!=cont );
		
		
	}

}


