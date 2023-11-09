package pg04;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz= {
				{3,7,9,1,15},
				{16,2,18,12,6},
				{4,14,13,19,20},
				{5,8,10,11,17},
				
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca número entero del 1-20");
		int valor=sc.nextInt();
		
		int valori=0;
		int valorj=0;
		boolean encontrado=false;
		int control=0;
		
		 for(int i=0;i<=3 && !encontrado;i++)
			 for (int j=0;j<=4 && !encontrado;j++) {
			 control++;
				 if (valor==matriz[i][j]) {
				 valori=i;
				 valorj=j;
				 encontrado=true;
				 
				 }	
			 }
		 
		 System.out.println("El valor introducido esta en la posición ["+valori+"]["+valorj+"].");
		 System.out.println(control);
		 
		 sc.close();
	}

}
