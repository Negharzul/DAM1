package pg07;

import java.util.Arrays;

public class Ejercicios10 {
	
	public static void main(String[] Args) {
	
		System.out.println(Arrays.toString(primos()));
	}

	private static int[] primos() {
		int nPrimos=0;
		int cuenta=0;
		for(int j=2;j<=100;j++) {
			for (int i=2;i<j;i++) {
		
			if(j%i==0 && j!=i) cuenta++;
		    }
			if(cuenta==0)nPrimos++;
			cuenta=0;
	    }
		int[] primos=new int[nPrimos];
		int cuenta2=0;
		for(int j=2;j<=100;j++) {
			for (int i=2;i<j;i++) {
		
			if(j%i==0 && j!=i) cuenta++;
		    }
			if(cuenta==0) {
				primos[cuenta2]=j;
				cuenta2++;
			}
			cuenta=0;
	    }
		return primos;
	}
	
}



