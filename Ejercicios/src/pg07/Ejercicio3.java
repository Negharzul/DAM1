package pg07;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero= 71;
		
		System.out.println(esPrimo(numero));
	}

	/*private static boolean esPrimo(int x) {
		int[] primos=new int[]{2,3,5,7,9,11,13,17,19,21};
		boolean esPrimo=true; 
		
		for(int i=0;i<primos.length;i++) {
			if (x%primos[i]==0 && x!=primos[i])esPrimo=false;
		}
		
		return esPrimo;  
	}
	*/
	private static boolean esPrimo(int x) {
		int[] numeros=new int[x-1];
		boolean esPrimo=true;
		
		for(int i=2;i<numeros.length;i++) {
			if(x%i==0) esPrimo=false;
		}
		
		
		return esPrimo;
	}
		
		
		
	
	
}
