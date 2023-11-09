package pg06;

import java.util.Scanner;

class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		
		int valor=sc.nextInt();
		boolean dentro=false;
		
		for (int i=0;i<n.length;i++) if (valor==n[i]) dentro=true;
		
		if(dentro==true) System.out.println("El valor está en el array.");
		else System.out.println("El valor no está en el array.");
		
		sc.close();
	}

}
