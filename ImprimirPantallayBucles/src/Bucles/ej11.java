package Bucles;

import java.util.Scanner;
import static java.lang.Math.*;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		//math.pow(base, exponente) 
		double num;
		double cont=0;
		System.out.println("escribe un numero");
		num =sn.nextInt();
		for (int i = 0; i <=4; i= i	+1 ) {
			
		System.out.printf("\nel cuadrado es: %4.1f  y el cubo es :  %3.0f  ",pow(num + i, 2),pow(num + i, 3));
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
