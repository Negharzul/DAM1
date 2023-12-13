package pg00;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      /*De manera estructurada, utilizando métodos, desarrolle un juego basado
en adivinar un número entre 20 y 80 elegido al azar por el programa. El
usuario dispondrá de un máximo de seis intentos. Si el usuario introduce
un número fuera del rango, el programa le permitirá rectificar sin contar
ese intento. El programa acabará cuando el usuario agote sus intentos o
acierte el número. A cada fallo del usuario, el programa indicará si el
número a adivinar es mayor o menor que el introducido. Tras acabar, el
jugador tendrá la oportunidad de volver a jugar. Al finalizar, el programa
informará al usuario del resultado final del juego.*/
		
		int numAleatorio=generarNumero();
		int intentos=0;
		boolean victoria=false;
		do {
			victoria=intentar(numAleatorio);
			intentos++;
			comprobarFallos(intentos,victoria);
		}while(intentos<6 && victoria==false);
		resultadoFinal(victoria);
		
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

