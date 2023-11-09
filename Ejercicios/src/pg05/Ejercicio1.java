package pg05;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce la palabra a adivinar: ");
		String palabra=sc.next();
		palabra=palabra.toUpperCase();
		int longitud= palabra.length();
		
		char[] ahorcado=new char[longitud];
		
		for (int i=0;i<longitud;i++) ahorcado[i]=palabra.charAt(i);
		
		char[] solucion=new char[longitud];
		for(int i=0;i<longitud;i++) solucion[i]='_';
		
		
		int contador=0;
	    int error=0;
	    int ganador=0;
		while(error<3 && ganador!=longitud) {
			System.out.println("Escribe una letra ");
			
			char intento1=sc.next().toUpperCase().charAt(0);
		
		for (int j=0;j<longitud;j++) {
			if(intento1==ahorcado[j]) {
				solucion[j]=intento1;
				contador++;
				ganador++;
			}
		}
		if (contador==0)error++;
		
		for (int i=0;i<longitud;i++) System.out.print(solucion[i]+" ");
		System.out.println();
		contador=0;
		}
		if (ganador==longitud)System.out.println("¡Adivinaste la palabra!");
		else {
			System.out.println("Perdiste, la palabra correcta era: ");
			for (int i=0;i<longitud;i++) System.out.print(ahorcado[i]);
		}
		sc.close();
		
	}

}
