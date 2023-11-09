package pg04;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		double[] Array=new double[5];
		
		for (int i=0;i<=4;i++) {
			Array[i]=sc.nextDouble();
			
		}
		double media= (Array[0]+Array[1]+Array[2]+Array[3]+Array[4])/5;
		int grande=0;
		
		for (int i=0;i<=4;i++) {
			if (media<Array[i]) grande++;
			
		}
		
		System.out.println(grande+" numeros son superiores a la media");
		sc.close();
	}

}
