package pg03;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int pos=0;
		
		for (int i=0;i<=4;i++) {
			int n=sc.nextInt();
			if(n>0) pos++;
			
			
		}
		
		System.out.println("Introdujo "+ pos+" numeros positivos");
		sc.close();
		
	}

}
