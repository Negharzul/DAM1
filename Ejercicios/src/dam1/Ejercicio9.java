package dam1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("numero 1");
		int n1=sc.nextInt();
		
		System.out.println("numero 2");
		int n2=sc.nextInt();

		System.out.println("numero 3");
		int n3=sc.nextInt();
		int nmax;
		
		if(n1>n2) { 
			nmax=n1;
			
		}else nmax=n2;
		
		if(nmax<n3) {
			nmax=n3;
			
		}
		
		System.out.println("El numero mas alto es: "+nmax);
		
	}

}
