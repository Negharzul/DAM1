package dam1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		System.out.println("numero 1");
		int n1=sc.nextInt();
		
		System.out.println("numero 2");
		int n2=sc.nextInt();

		System.out.println("numero 3");
		int n3=sc.nextInt();
		int nmin;
		
		if(n1<n2) {
			nmin=n1;
		}else nmin=n2;
		
		if(nmin>n3) {
			nmin=n3;
			
		}
		
		System.out.println("El numero mas pequeño es: "+nmin);
				
		
		
	}

}
