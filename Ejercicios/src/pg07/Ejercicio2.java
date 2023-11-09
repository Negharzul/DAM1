package pg07;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=4;
		int n2=5;
		
		if (multiplo(n1,n2)==true) System.out.println("son multiplos");
		else System.out.println("no son multiplos");
	
		
	}

	private static boolean multiplo(int n1, int n2) {
		
		
		return n1%n2==0 || n2%n1==0;
	}
	
}
