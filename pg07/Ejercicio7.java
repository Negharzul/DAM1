package pg07;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		
		ordenar(n);
		System.out.println(Arrays.toString(n));
	}

	private static void ordenar(int[] datos) {
		int pMenor;
		int aux;
		for (int i=0;i<datos.length;i++) {
			pMenor=i;
			
			for (int j=i;j<datos.length;j++) if (datos[j]<datos[pMenor]) pMenor=j;
		
			aux=datos[i];
			datos[i]=datos[pMenor];
			datos[pMenor]=aux;
		}
		
		
		
	}
	
}
