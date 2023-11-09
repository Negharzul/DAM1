package zera;

import java.util.Scanner;

public class probando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
	       int[] notas = new int[10];

	       for (int i=0; i<10; i++) notas[i] = sc.nextInt();

	       int numeroMayor = notas[0];
	       int numeroMenor = notas[0];
	       for (int i=1; i<10; i++) 
	       {
	         if (notas[i] > numeroMayor) numeroMayor = notas[i];
	         if (notas[i] < numeroMenor) numeroMenor = notas[i];
	       }

	       int numeroMayorCont = 0; 
	       int numeroMenorCont = 0; 
	       for (int i=0; i<10; i++) 
	       {
	         if (notas[i] == numeroMayor) numeroMayorCont++;
	         if (notas[i] == numeroMenor) numeroMenorCont++;
	       }

	       System.out.print("El mayor número es " + numeroMayor + " y se repite " + numeroMayorCont + " veces"); 
	       System.out.print("El menor número es " + numeroMenor + " y se repite " + numeroMenorCont + " veces"); 
	       sc.close();
	}

}
