package examen01;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[][] pruebaGrande= new char[][] {
			{'M','E','S','A'},
			{'C','A','S','A'},
			{'P','I','L','A'},
			{'O','C','A','S'},
			{'L','I','S','A'}
		};
		
		String[] pruebaPalabra =new String[] {"MESA","MESA","l","0"};
		
		System.out.println(palabrasMatriz(pruebaGrande, pruebaPalabra));
		
		
	}

	private static int palabrasMatriz(char[][] m, String[] palabras){
		int palabrasContenidas=0;
		
		for (int i=0;i<palabras.length;i++) 
			if(contenida(m,palabras,i)) palabrasContenidas++;
			
		
		
		
		return palabrasContenidas;
	}
	private static boolean contenida(char[][] m,String[] palabras,int x) {

		for(int i=0;i<m.length;i++) {
				for(int j=0;j<=m[0].length-palabras[x].length();j++) {
					if(m[i][j]==palabras[x].toUpperCase().charAt(0)) {
						
						for(int k=0,contador=0;k<palabras[x].length();k++) {
							if(m[i][j+k]==palabras[x].toUpperCase().charAt(k))contador++;
							if(contador==palabras[x].length()) return true;
						}
						
					}
				
			}
		}
		
		
		return false;
	}
	
	
}
