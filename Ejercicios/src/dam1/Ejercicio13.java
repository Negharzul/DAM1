package dam1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Año");
		int anno=sc.nextInt();
		
		System.out.println("Mes");
		int mes=sc.nextInt();
		
		System.out.println("Dia");
		int dia=sc.nextInt();
		
		
		Boolean fecha=true;
		
		if (anno<1) fecha=false;
		
		switch (mes) {
		
		case 4,6,9,11: if (dia<1 || dia>30)  fecha=false; break;
		case 2: if (dia<1 || dia>28) fecha=false;   break;
		default: if (dia<1 || dia>31) fecha=false; break;
		}
		
		if (mes<1 || mes>12) fecha=false;
		
		
		if (fecha==true) System.out.println("Fecha correcta");
		if (fecha==false)System.out.println("Fecha incorrecta");
		
	}

}
