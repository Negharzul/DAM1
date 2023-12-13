package pg00;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desarrolle el método
private static void imprimirApariciones (int[] datos);
que muestra al usuario un informe indicando cada uno de los números que aparece en
el vector y las veces que aparece.*/
		
		int [] prueba= new int[] {1,1,5,6,6,6,7};
		
		imprimirApariciones(prueba);
		
	}

	private static void imprimirApariciones(int [] datos){

		
		for(int i=0;i<datos.length;i++) {
			boolean contado=false;
			int repeticiones=0;
			for (int j=0;j<i;j++) {
			if(datos[i]==datos[j])contado=true;	
			}
			

			
			if(contado==false) {
				for(int j=i;j<datos.length;j++) {
					if(datos[i]==datos[j]) repeticiones++;
				}
				if(repeticiones==1)System.out.println("El numero "+datos[i]+" se encuentra "+repeticiones+" vez en el vector.");
				else System.out.println("El numero "+datos[i]+" se encuentra "+repeticiones+" veces en el vector.");
			}
			
		}
		
	}
	
}
