package ImprimirPantalla;

import java.util.Scanner;

public class ej5 {
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		double peseta;
		System.out.println("Escribe la cantidad deseada");
		peseta=sn.nextInt();
		double euro = peseta/166;
		System.out.println(euro+"euros");
		
		sn.close();
	
	

	}
}