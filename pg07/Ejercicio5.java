package pg07;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(aleatorio(50));
		
		
		
	}

	private static int aleatorio(int entero) {
		int random= (int)(Math.random()*entero)+1;
		
		
		return random;
	}
	
	
}
