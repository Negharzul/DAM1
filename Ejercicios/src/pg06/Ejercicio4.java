package pg06;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		
		int menor=n[0];
		int posicion=0;
		
		for(int i=0;i<n.length;i++) if(menor>n[i]) {
				menor=n[i];
				posicion=i;
			}
		
		int[] copia=new int[n.length];
		for(int i=0;i<n.length;i++) {
			copia[i]=n[i];
		}
		
	    n[0]=menor;
		for (int i=1;i<=posicion;i++) n[i]=copia[i-1];
		
		int menor2=n[1];
		for (int i=1;i<n.length;i++) if(menor2>n[i]) {
				menor2=n[i];
				posicion=i;
			}
		
		for(int i=0;i<n.length;i++) copia[i]=n[i];
		
		
		n[1]=menor2;
		for (int i=2;i<=posicion;i++) n[i]=copia[i-1];
		
		int menor3=n[2];
		for (int i=2;i<n.length;i++) if(menor3>n[i]) {
			menor3=n[i];
			posicion=i;
		}
		for(int i=0;i<n.length;i++) copia[i]=n[i];
		n[2]=menor3;
		for (int i=3;i<=posicion;i++) n[i]=copia[i-1];
		
		
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(copia));
	}

}
