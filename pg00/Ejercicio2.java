package pg00;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desarrolle el método
private static void ordenarFilas (char[][] matriz)
que ordena las filas de la matriz alfabéticamente de modo ascendente.
Como ejemplo se muestra una hipotética matriz antes y después de ser
procesada por el método.

*/
		char[][] Antes={ 
			{'M','E','S','A'},
			{'C','A','S','A'},
			{'P','I','L','A'},
			{'O','C','A','S'},
			{'L','I','S','A'}
		};
		
		ordenarFilas(Antes);
		for(int i=0;i<Antes.length;i++) {
			System.out.println();
			for(int j=0;j<Antes[0].length;j++) {
				System.out.print(Antes[i][j]);
			}
		}
		
	}

	private static void ordenarFilas (char[][] matriz) {
		
		
		for (int j=0;j<matriz.length-1;j++) {
			
			for(int i=j+1;i<matriz.length;i++) {
				int k=0;
				while((int)matriz[j][k]==(int)matriz[i][k] && k<matriz[0].length) {
					k++;
				}
				
			if((int)matriz[j][k]>(int)matriz[i][k]) {
				intercambiarFilas(matriz, j, i);
			}
		}
			
		}
			

		
	}
	
	private static void intercambiarFilas(char[][] matriz,int x,int y) {
		char aux;
		
		for(int i=0;i<matriz[0].length;i++) {
			aux=matriz[x][i];
			matriz[x][i]=matriz[y][i];
			matriz[y][i]=aux;
		}
	}
}
