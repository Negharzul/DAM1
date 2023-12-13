package pg00;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desarrolle el método
		private static boolean contenidoHorizontal(char[][] m, char[] v);
		que indica si la palabra contenida en el vector v está contenida horizontalmente (leída
		de derecha a izquierda o de izquierda a derecha) en la sopa de letras m.*/
	
		boolean contenida;
		char[][] Antes={ 
				{'M','E','S','A'},
				{'C','A','S','A'},
				{'P','I','L','A'},
				{'O','C','A','S'},
				{'L','I','S','A'}
				};
		
		char[] prueba= {'C','O',};
		
		contenida=contenidoHorizontal(Antes, prueba);
		
		System.out.println(contenida);
		
	}

	private static boolean contenidoHorizontal(char[][] m,char[] v) {
	
		
		for(int i=0;i<m.length;i++) for(int j=0;j<m[0].length;j++) 
			
			if(m[i][j]==v[0]) {
				
				if(j<=m[0].length-v.length) for(int k=0,contador=0;k<v.length;k++) {
					if(m[i][j+k]==v[k]) contador++;
					if (contador==v.length) return true;
				}
				
				if(j+1-v.length>=0) for(int k=0,contador=0;k<v.length;k++) {
					if(m[i][j-k]==v[k]) contador++;
					if (contador==v.length) return true;
				}
				
			}
		
		
		return false;	
	}
	
}
