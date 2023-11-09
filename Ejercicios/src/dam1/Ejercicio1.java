package dam1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("introduzca un numero entero");
		int n1=input.nextInt();
		
		System.out.println("introduzca un segundo numero entero");
		int n2=input.nextInt();
		 
		int n3=n1+n2;
		System.out.println("La suma de ambos numeros es: "+n1+n2);
		System.out.println(n1*n2);
		
		
	}

}
