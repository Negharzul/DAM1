package pg06;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		int menor;
		int pmenor;
		int aux;
		 
		for (int j=0;j<n.length;j++) {
			menor =n[j];
			pmenor = j;
		for (int i=j;i<n.length;i++) {
			if (n[i]<menor) {
				menor=n[i];
				pmenor=i;
			}
		}
		aux=n[j];
		n[j]=n[pmenor];
		n[pmenor]=aux;
		
		
	    }
		
		System.out.println(Arrays.toString(n));
		
	}

}
