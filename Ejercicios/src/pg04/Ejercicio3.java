package pg04;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] n=new int[10];
		
		for(int i=0;i<10;i++) {
			n[i]=sc.nextInt();
			
		}
		
		for (int i=0;i<10;i++) {
			System.out.print(n[9-i]+" ");
			
			sc.close();
		}
	}

}
