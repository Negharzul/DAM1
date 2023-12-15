package examen01;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//implementa el metodo private static int[] datosPositivos(int[] datos){ que devuelve un array del tamaño minimo necesario que devuelve unicamente los valores positivos del array parametro.
		
		//considero el 0 negativo.
		int[] numeros=new int[] {1,2,3,-1,-2,5,5,-4,7,20,13,-7};
		
		int[]positivos= datosPositivos(numeros);
		
		System.out.println(Arrays.toString(positivos));
	}

	
	private static int[] datosPositivos(int[] datos){
		int positivos=0;
		int pGrande;
		int aux;
		
		for (int i=0;i<datos.length;i++) {
			if(datos[i]>0) positivos++;
			
		}
		
		for (int i=0;i<datos.length;i++) {
			pGrande=i;
			
			for (int j=i;j<datos.length;j++) if (datos[j]>datos[pGrande]) pGrande=j;
		
			aux=datos[i];
			datos[i]=datos[pGrande];
			datos[pGrande]=aux;
			
		}
		
		int[] mPositivos=new int[positivos];
		
		
		for(int i=0;i<mPositivos.length;i++) {
			
			mPositivos[i]=datos[i];
			
			
		}
		
		
		return mPositivos;
	}
}
