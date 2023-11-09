package dam1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int n3=n1*n2;
		
		if (n3>10) {
			System.out.println(n3);
			
		}else System.out.println("el producto es inferior a 10");
		
		
		
		
	}

}
