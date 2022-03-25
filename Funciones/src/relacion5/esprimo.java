package relacion5;

import java.util.Scanner;

//Devuelve el menor primo que es mayor al número que se pasa
//como parámetro.
public class esprimo {
	public static boolean primo (int a) {
		
		boolean joseluis = true;
		
		int resto = 0;
		int cont = 0; 
		
		for (int i = 1; i <= a; i++) {
			resto = a % i ;
			if (resto == 0) {
				cont = cont + 1;
			}
		}
		if (cont == 2) {
			
			joseluis = true;
		
		}else {
			if (cont != 2) {
				
				joseluis = false;
			}
					
		}
		
		
	return joseluis ;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int numerocomprobasion;
		numerocomprobasion=sn.nextInt();
		System.out.println(primo(numerocomprobasion));
	}

}
