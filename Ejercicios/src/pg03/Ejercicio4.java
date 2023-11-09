package pg03;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=1;
		int pos=0;
		int neg=0;
		
		while(n!=0) {
			System.out.print("Introduzca un numero entero: ");
			n=sc.nextInt();
			
			if (n>0) pos++;
			if (n<0) neg++;
			
		}
		
		System.out.println("Positivos: "+pos+" Negativos: "+neg);
		
		sc.close();
	}

}
