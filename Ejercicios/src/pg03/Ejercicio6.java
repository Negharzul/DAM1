package pg03;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero");
		int n1=sc.nextInt();
		
		for(int i=0;i<=3;i++) {
			System.out.println("Introduzca otro numero entero");
			int n2=sc.nextInt();
			
			if (n1<n2) n1=n2;
		}
		System.out.println("El mayor numero escrito fue "+ n1);
		
		sc.close();
	}

}
