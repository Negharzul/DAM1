package pg04;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] intarray=new int[10];
		
		int menor=0;
		int mayor=0;
		
		for (int i=0;i<10;i++) {
			
			System.out.println("Introduce un numero entero");
			intarray[i]=sc.nextInt();
			
			if(menor==0) menor=intarray[i];
			if(mayor==0) mayor=intarray[i];
			
			if(intarray[i]<menor) menor=intarray[i];
			if(intarray[i]>mayor) mayor=intarray[i];
		}
		int repmenor=0;
		int repmayor=0;
		
		for (int i=0;i<10;i++) {
			if (intarray[i]==menor) repmenor++;
			if (intarray[i]==mayor) repmayor++;
			
		}
		
		System.out.println("El numero mas grande es "+mayor+" y se repite "+repmayor+" veces.");
		System.out.println("El numero mas pequeño es "+menor+" y se repite "+repmenor+" veces.");
		
		sc.close();
		
	}

}
