package dam1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca año");
		int anno= sc.nextInt();
		System.out.println("Introduzca mes(numero)");
		int mes= sc.nextInt();
		System.out.println("introduzca dia(numero)");
		int dia= sc.nextInt();
		
		if (anno<0) {
			System.out.println("Fecha incorrecta");
		}else if (anno>2023) {
			System.out.println("Fecha incorrecta");
		}else if(mes<0) {
			System.out.println("fecha incorrecta");
		}else if (mes>12) {
			System.out.println("Fecha incorrecta");
		}else if (dia<0) {
			System.out.println("fecha incorrecta");
		}else if (dia>30) {
			System.out.println("Fecha incorrecta");
		}else System.out.println("Fecha correcta");
		
		sc.close();
	}

}
