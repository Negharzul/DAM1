package dam1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n1= sc.nextInt();
		
		if(n1>0) {
			System.out.println("El numero es positivo");
			
		}else if(n1==0) {
			System.out.println("El numero es nulo");
			
		}else System.out.println("El numero es negativo");
		
		
		
	}

}
