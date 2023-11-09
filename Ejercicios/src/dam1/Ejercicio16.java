package dam1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca nota");
		int nota=sc.nextInt();
			
		
		String calificacion;
		
		switch (nota) {
		
		case 0,1,2,3,4: calificacion="Insuficiente"; break;
	    case 5: calificacion="Suficiente"; break;
	    case 6: calificacion="Bien"; break;
	    case 7,8:calificacion="Notable"; break;
	    case 9,10:calificacion="Sobresaliente"; break;
	    default: calificacion="Error";break;
	    }
		
		System.out.println("Saco usted un "+calificacion);
		
		sc.close();
	}

}
