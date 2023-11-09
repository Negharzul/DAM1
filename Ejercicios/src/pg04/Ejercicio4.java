package pg04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] n =new int[10];
		double acumulado=0;
		
		for(int i=0;i<10;i++) {
			
			n[i]=sc.nextInt();
			
			acumulado += n[i];
		}
		double media=acumulado/10;
		
		int mayor=n[0];
		int menor=n[0];
		for(int i=0;i<10;i++) {
			if (n[i]>mayor) mayor=n[i];
			if (n[i]<menor) menor=n[i];
		}
		if (mayor-menor>=3 ) media=(acumulado-mayor-menor)/8;
		
		
			
		System.out.println(media);
		
		sc.close();
	}

}
