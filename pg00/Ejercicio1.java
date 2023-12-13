package pg00;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Desarrolle el método
private static boolean matrizContenida (char[][] mGrande , char[][] mPequenya)
que comprueba si el segundo parámetro está contenido en el primero.
Desarrolle un algoritmo eficiente.*/

		
		char[][] pruebaGrande= new char[][] {
			{'M','E','S','A'},
			{'C','A','S','A'},
			{'P','I','L','A'},
			{'O','C','A','S'},
			{'L','I','S','A'}
		};
		
		char [][] pruebaPequenia= new char[][] {
			{'O','C','A'},
			{'L','I','S'}
		};
		 
		if (matrizContenida(pruebaGrande,pruebaPequenia)) System.out.println("Está contenida");
		else System.out.println("No está contenida");
	}

	
	private static boolean matrizContenida (char[][] mGrande , char[][] mPequenya) {
	
		boolean contenida=false;
		char charInicial=mPequenya[0][0];
		int i=0;
		int j=0;
		while( i<= mGrande.length-mPequenya.length && contenida==false) {
			while(j<= mGrande[i].length-mPequenya.length && contenida==false) {
				if(mGrande[i][j]==charInicial) contenida=copiaExacta(i, j, mGrande, mPequenya);
				j++;
			}
			j=0;
			i++;	
		}
		
		/*for(int i=0;i<mGrande.length;i++) {
			for(int j=0;j<mGrande.length;j++) {
				
				if(mGrande[i][j]==charInicial) contenida=copiaExacta(i, j, mGrande, mPequenya);
			}
		}No es eficiente */
		return contenida;
	}
	
	
	private static boolean copiaExacta(int x, int y,char[][] mGrande,char[][] mPequenya) {
		boolean iguales=true;
		for (int i=0;i<mPequenya.length;i++) {
			for(int j=0;j<mPequenya[i].length;j++) {
				if(mGrande[x+i][y+j]!=mPequenya[i][j])iguales=false;
			}
		}
		
		
		
		return iguales;
	}
}
