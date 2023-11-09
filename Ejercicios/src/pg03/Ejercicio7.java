package pg03;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nombre");
		String empleado=sc.next();
		System.out.println("Sueldo €");
        double sueldo=sc.nextDouble();
		
		double sueldomax=sueldo;
		String empleadomax=empleado;
		double sueldomin=sueldo;
		String empleadomin=empleado;
		
		for (int i=0;i<=3;i++) {
			System.out.println("Nombre");
			empleado=sc.next();
			System.out.println("Sueldo €");
	        sueldo=sc.nextDouble();
			
			if (sueldo>sueldomax) {
				sueldomax=sueldo;
				empleadomax=empleado;
			}
			if (sueldo<sueldomin) {
				sueldomin=sueldo;
				empleadomin=empleado;
			}
			
		}
	
		
		System.out.println("El empleado que mas cobra es: "+empleadomax+" con un sueldo de: "+sueldomax+" €.");
		System.out.println("El empleado que menos cobra es: "+empleadomin+" con un sueldo de :"+sueldomin+" €.");
		
		sc.close();
	}

}
