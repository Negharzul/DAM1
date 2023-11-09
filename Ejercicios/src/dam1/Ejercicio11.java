package dam1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		System.out.println("numero 1");
		int n1=sc.nextInt();
		
		System.out.println("numero 2");
		int n2=sc.nextInt();

		System.out.println("numero 3");
		int n3=sc.nextInt();
		int aux;
		
		if (n1>n2) {
			aux=n2;
			n2=n1;
			n1=aux;
			}
		
		if (n3<n2) {
			aux=n2;
			n2=n3;
			n3=aux; 
		}
		
		if(n1>n2){
			aux=n2;
			n2=n1;
			n1=aux;
			
		}
		
		System.out.println("mas pequeño:"+n1+" 2º: "+n2+" 3º: "+n3);
		
	}

}
