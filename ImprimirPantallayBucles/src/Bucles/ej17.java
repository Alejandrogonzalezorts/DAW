package Bucles;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n;
		System.out.println("escribe un numero");
		n = sn.nextInt();
		for (int i = 1; i == i + n; i++) {
			n = n +1; 
			System.out.println(n);
		}
	}

}
