package Bucles;
import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
//		Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son
//		negativos
		Scanner sn=new Scanner(System.in);
		int positivo=0;
		int negativo=0;
		int n;
		for (int i = 0; i < 10; i++) {
			System.out.println("intoduce un numero");
			n = sn.nextInt();
			if (n <0) {
				negativo = negativo + 1; 
				
			}
			else {
				positivo = positivo +1;
			}
			
		}
		System.out.println("hay"+ positivo+" numeros positivos y "+ negativo+ " numeros negativos");
	}

}
