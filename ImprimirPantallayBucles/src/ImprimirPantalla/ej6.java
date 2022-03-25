package ImprimirPantalla;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		//definir cantidad
		double cant;
		//escribir por pantalla
		System.out.println("escribe la cantidad deseada");
		//el usuario escribe el dato
		cant=sn.nextInt();
		
		double IVA= cant +(cant * 0.21);
		System.out.println("Mas IVA es " +IVA);
		
		
		sn.close();
	
	}

}
