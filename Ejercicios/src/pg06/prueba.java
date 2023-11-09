package pg06;

import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		int menor= n[0];
		int pmenor= 0;
		
		for (int i=0;i<n.length;i++) {
			if (n[i]<menor) {
				menor=n[i];
				pmenor=i;
			}
	}
		int aux=n[0];
		n[0]=n[pmenor];
		n[pmenor]=aux;
		
		System.out.println(Arrays.toString(n));
		
		
	}
}
