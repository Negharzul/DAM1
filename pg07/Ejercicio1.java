package pg07;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=2;
		int n2=7;
		int n3=-3;
		
		System.out.println("el numero mayor es "+mayor(n1,n2,n3));
		
	}

	private static int mayor(int numero1,int numero2,int numero3) {
		int mayor;
		if(numero1>numero2) mayor=numero1; else mayor=numero2;
		if(numero3>mayor) mayor=numero3;	
		
		
		return mayor;
	}
	
}
