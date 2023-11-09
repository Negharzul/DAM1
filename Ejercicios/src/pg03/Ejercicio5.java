package pg03;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n1;
		int n2=0;
		int n3=0;
		int n4=0;
		
		do {
			System.out.print("Introduzca un numero entero positivo: ");
			n1=sc.nextInt();
			if(n1>=1 && n1<=10) n2++;
			if(n1>10) n3++;
			if(n1<1) System.out.println("El numero debe ser positivo");
			if(n1>0)n4++;
		}while (n4<10);
		
		System.out.println("Entre 1 y 10: "+n2+" Mayores de 10: "+n3);
		
		sc.close();
	}

}
