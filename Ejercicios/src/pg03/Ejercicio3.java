package pg03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int pos=0;
		int neg=0;
		int nul=0;
		
		for(int i=0;i<=9;i++) {
			System.out.print(" Introduzca un numero entero: ");
			int n=sc.nextInt();
			
			if (n<0) neg++;
			if (n==0)nul++;
			if (n>0)pos++;
		}
		
		System.out.println("Positivos: "+pos+" negativos: "+neg+" nulos: "+nul);
		
		sc.close();
		
	}

}
