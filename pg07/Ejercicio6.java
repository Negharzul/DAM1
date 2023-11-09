package pg07;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=5;
		int n2=25;
	
		
		System.out.println(aleatorio(n1,n2));
	}

	private static int aleatorio(int num1, int num2) {
		if(num1>num2) {
			int aux=num1;
			num1=num2;
			num2=aux;
		}
		int random=(int)(Math.random()*(num2-num1))+num1;
		return random;
	}
	
	
}
