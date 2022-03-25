package relacion5;
import relacion5.esprimo;
public class ej3 {
	public static int primomayor (int a) {
		
		int nprimo=0;
		int resto = 0;
		int cont = 0;
		boolean encontrado = true;
		do {
			if (esprimo.primo(a)) {
			nprimo = a+1;
			if  (esprimo.primo(nprimo));
			encontrado = false;
			
			}
		} while (encontrado= false);
		return nprimo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
