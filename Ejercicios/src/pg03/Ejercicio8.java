package pg03;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nombre empleado");
		String empleado=sc.next();
		System.out.println("Sueldo empleado €");
		double sueldo=sc.nextDouble();
		
		String empleadomax=empleado;
		Double sueldomax=sueldo;
		String empleado2=empleado;
		Double sueldo2=0.0;
		
		for (int i=0;i<=3;i++) {
			System.out.println("Nombre empleado");
			empleado=sc.next();
			System.out.println("Sueldo empleado €");
			sueldo=sc.nextDouble();
			
			if(sueldo>sueldomax) {
				sueldomax=sueldo;
				empleadomax=empleado;
			}
			if(sueldo<sueldomax && sueldo>sueldo2) {
				sueldo2=sueldo;
				empleado2=empleado;
				
			}
			
		}
		
		System.out.println("El empleado que mas cobra es: "+empleadomax+" con un sueldo de: "+sueldomax+"€.");
		System.out.println("El segundo empleado que mas cobra es: "+empleado2+" con un sueldo de: "+sueldo2+"€.");
		
		sc.close();
	}

}
