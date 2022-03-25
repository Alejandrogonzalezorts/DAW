package Bucles;
import java.util.Scanner;
public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
//		Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la
//		serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
//		tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir
//		por teclado.
		
		int n = 0;
		int n1=0;
		int n2=1;
		int suma;

		System.out.println("introduce el numero");
		n =sn.nextInt();
		System.out.print("0 1 ");
		for (int i = 0; i <n-2; i++) {
			suma =n1+n2;
		System.out.print(suma+" ");
			n1 = n2;
			n2 = suma;
			
		}
		
				

	}

}
