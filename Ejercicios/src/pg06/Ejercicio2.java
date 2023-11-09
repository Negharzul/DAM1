package pg06;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] enteros =  {1,3,5,6,7,20,21,22,30,47};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int numero=sc.nextInt();
		boolean dentro=false;
		
		for(int i=0;i<enteros.length;i++) if(numero==enteros[i]) dentro=true;
		
		if(dentro==true) System.out.println("El valor está dentro del array.");
		else System.out.println("El valor no está dentro del array.");
		
		sc.close();
		
	}

}
