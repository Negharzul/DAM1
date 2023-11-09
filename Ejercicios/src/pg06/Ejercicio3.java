package pg06;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		
		int menor=n[0];
		int pmenor=0;
		
		for(int i=0;i<n.length;i++) if(menor>n[i]) {
				menor=n[i];
				pmenor=i;
			}
		
		int[] copia=new int[pmenor];
		
		for(int i=0;i<pmenor;i++) copia[i]=n[i];
		
	    n[0]=menor;
		for (int i=1;i<=pmenor;i++) n[i]=copia[i-1];
		
		System.out.println(Arrays.toString(n));
	}

}
