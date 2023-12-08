package pg08;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Elige la palabra a adivinar:");
		ahorcado partida=new ahorcado(sc.next());
		partida.jugar();
		sc.close();
	}

	
}
 class ahorcado{
	 private char[] respuesta;
	 private char[] intento;
	  
	 public ahorcado(String palabra) {
		 palabra=palabra.toUpperCase();
		 int longitud= palabra.length();
		 
		 respuesta=new char[longitud];
		 for (int i=0;i<longitud;i++) respuesta[i]=palabra.charAt(i);
		 
		 intento=new char[longitud];
		 for(int i=0;i<longitud;i++) intento[i]='_';
	 }
	  
	 public void jugar() {
			int contador=0;
		    int error=0;
		    int ganador=0;
		    Scanner sc=new Scanner(System.in);
			while(error<3 && ganador!=respuesta.length) {
				System.out.println("Escribe una letra ");
				
				char intento1=sc.next().toUpperCase().charAt(0);
			
			for (int i=0;i<respuesta.length;i++) {
				if(intento1==respuesta[i]) {
					intento[i]=intento1;
					contador++;
					ganador++;
				}
			}
			if (contador==0)error++;
			
			for (int i=0;i<respuesta.length;i++) System.out.print(intento[i]+" ");
			System.out.println();
			contador=0;
			}
			if (ganador==respuesta.length)System.out.println("¡Adivinaste la palabra!");
			else {
				System.out.println("Perdiste, la palabra correcta era: ");
				for (int i=0;i<respuesta.length;i++) System.out.print(respuesta[i]);
				sc.close();
			}
		 
	 }
	 
	 
	  
}