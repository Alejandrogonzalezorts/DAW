package examen;
import java.util.Scanner;



public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);

		int fichaJ1=0;
		int fichaJ2=0;
		int minDado;
		int maxDado;
		int tirada1;
		int tirada2;
		String nomJ1;
		String nomJ2;
		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cual es el numero minimo del dado?");
			minDado =sn.nextInt();
		System.out.println("¿Cual es el numero maximo del dado?");
			maxDado = sn.nextInt();
		System.out.println("¿Cual es el nombre del jugador 1?");
			nomJ1 = sn.next();
		System.out.println("¿Cual es el nombre del jugador 2?");
			nomJ2 = sn.next();
			
			
		if (nomJ1 != nomJ2) {
			
				
			
			System.out.println("los dos jugadores no se pueden llamar igual");
			System.out.println("¿Cual es el nombre del jugador 2?");
			nomJ2 = sn.next();

		}
		System.out.println("¡COMENCEMOS A JUGAR!");
		for (int i = 1; i <=11; i++) {
			System.out.print("   "+i+"	");
			
		}
		System.out.println("");
		System.out.println("J1");
		System.out.println("");
		System.out.println("J2");
		System.out.println("Pulsa cualquier tecla para la siguiente ronda");
		String siguiente = sn.next();
		
		System.out.println("Turno para el jugador 1 "+nomJ1);
		int tiro1=(int)(Math.random()*maxDado+1);
		System.out.println("ha sacado un  " + tiro1+" en la primera tirada");
		int tiro2=(int)(Math.random()*maxDado+1);
		System.out.println("ha sacado un  " + tiro2+" en la segunda tirada");
		
		int tirototal1 = tiro1 + tiro2;
		
		boolean esprimo = false;
		
		int resto = 0;
		int cont = 0; 
		
		for (int i = 1; i <= tirototal1; i++) {
			resto = tirototal1 % i ;
			if (resto == 0) {
				cont = cont + 1;
			}
		}
		if (cont == 2) {
			
			esprimo = true;
		
		}else {
			if (cont != 2) {
				
				esprimo = false;
			}
					
		}
		if (esprimo!=true) {
			System.out.println("¡TIRADA NO VALIDA");
			System.out.println("no suma puntos ya que la suma de los dos numeros NO ES PRIMO");
			for (int i = 1; i <=11; i++) {
				System.out.print("	"+i+"	");
			}
		
			System.out.println("");
			System.out.println("J1");
			System.out.println("");
			System.out.println("J2");
		}
		System.out.println("");
		if (esprimo==true) {
			for (int i = 1; i <=11; i++) {
				System.out.print("	"+i+"	");
				
			}
			System.out.println("");
			fichaJ1 = tirototal1;
			for (int i = 0; i < fichaJ1; i++) {
				System.out.print("	");
				
			}
			System.out.println("J1");
			
			System.out.println("");
			System.out.println("J2");
			
			
			
		}		
		if (fichaJ1 == fichaJ2) {
			System.out.println("¡Van empatados");
			
		}
		System.out.println("Turno para el jugador 2 "+nomJ2);
		int tiro3=(int)(Math.random()*maxDado+1);
		System.out.println("ha sacado un  " + tiro1+" en la primera tirada");
		int tiro4=(int)(Math.random()*maxDado+1);
		System.out.println("ha sacado un  " + tiro2+" en la segunda tirada");
		
		int tirototal2 = tiro3 + tiro4;
boolean esprimo2 = false;
		
		int resto2 = 0;
		int cont2 = 0; 
		
		for (int i = 1; i <= tirototal2; i++) {
			resto2 = tirototal2 % i ;
			if (resto2 == 0) {
				cont2 = cont2 + 1;
			}
		}
		if (cont2 == 2) {
			
			esprimo2 = true;
		
		}else {
			if (cont2 != 2) {
				
				esprimo2 = false;
			}
					
		}
		if (esprimo2!=true) {
			System.out.println("¡TIRADA NO VALIDA");
			System.out.println("no suma puntos ya que la suma de los dos numeros NO ES PRIMO");
			for (int i = 1; i <=11; i++) {
				System.out.print("	"+i+"	");
			}
		
			System.out.println("");
			System.out.println("J1");
			System.out.println("");
			System.out.println("J2");
		}
		System.out.println("");
		fichaJ2 = tirototal2;
		for (int i = 0; i < fichaJ2; i++) {
			System.out.print("	");
			
		}
		System.out.println("J2");
		
	
		
		
		
			
	if (fichaJ1 == fichaJ2) {
		System.out.println("¡Van empatados");
		}
}}
		
		
	

	


