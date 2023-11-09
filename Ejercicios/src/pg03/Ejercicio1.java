package pg03;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n1;
		do {
		System.out.println("Introduzca un numero entero");
		n1=sc.nextInt();
		}while(n1<1 || n1>10);
		
		System.out.println(n1);
		sc.close();
	}

}
