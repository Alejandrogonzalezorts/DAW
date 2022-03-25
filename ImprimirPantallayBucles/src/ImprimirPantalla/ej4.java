package ImprimirPantalla;
import java.util.Scanner;
public class ej4 {
	
	public static void main(String[] args) {
		
Scanner sn=new Scanner(System.in);
//definir la variable euro 
double euro;
//pedir al usuario que introduzca una cantidad y guardarla en euro 
		System.out.println("Introduce una cantidad");
		 euro=sn.nextInt();
			double peseta = euro*166;
			System.out.println(peseta+"pesetas");
			
		
		
	sn.close();

	}
	
	
}