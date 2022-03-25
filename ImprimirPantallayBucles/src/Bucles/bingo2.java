package Bucles;

public class bingo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [][] carton2= new int [3][5];
		//pintamos la matriz con un bucle for 
		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 5; j++) {
					carton2[i][0] =(int) (Math.random()*9+1);
					carton2[i][1] =(int) (Math.random()*9+10);
					carton2[i][2] =(int) (Math.random()*9+20);
					carton2[i][3] =(int) (Math.random()*9+30);
					carton2[i][4] =(int) (Math.random()*9+40);
			System.out.print(carton2[i][j]+" | ");
			
			}
			System.out.println("");
		}
	}
}
	

