package pg04;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {4,7,5,1,2,9,8,6,10,3};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un valor del 1 al 10");
		int valor=sc.nextInt();
		int posicion=-1;
		int i=0;
		while(posicion==-1) {
			if (n[i]==valor) posicion=i;
			i++;
		}
			
		
		
		System.out.println("el valor buscado esta en la posicion "+posicion);
		
		sc.close();
	}

}
