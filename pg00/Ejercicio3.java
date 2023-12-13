package pg00;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc=new Scanner(System.in);
		int numAleatorio=generarNumero();
		int intentos=0;
		boolean victoria=false;
		do {
			victoria=intentar(numAleatorio);
			intentos++;
			comprobarFallos(intentos,victoria);
		}while(intentos<6 && victoria==false);
		resultadoFinal(victoria);
		sc.close();
		
	}
	public static int generarNumero() {
		return (int)(Math.random()*60)+20;
	}
		
	public static boolean intentar(int numAleatorio) {
		Scanner sc=new Scanner(System.in);
		int numIntento;
		do {
			numIntento=sc.nextInt();
		}while(numIntento<20 || numIntento>80);
		
		return numAleatorio==numIntento;
		
	}
	public static void comprobarFallos(int intentos,boolean victoria) {
		if (victoria !=true) System.out.println("Fallaste, te quedan "+ (6-intentos)+" intentos.");
		
	}
	
	public static void resultadoFinal(boolean victoria) {
		if (victoria==true) System.out.println("¡¡Adivinaste el numero!!");
		if (victoria!=true) System.out.println("Perdiste la partida");
	}
	
}

