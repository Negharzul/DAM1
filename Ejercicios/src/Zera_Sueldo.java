import java.util.Scanner;

public class Zera_Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Cual es su sueldo");
		Double sueldo=entrada.nextDouble();
		
		System.out.println("Introduzca importe total de ventas");
		Double ventas=entrada.nextDouble();
		
		System.out.println("Introduzca kilometraje realizado");
		Double km=entrada.nextDouble();
		
		System.out.println("¿Cuantos dias tuvo que desplazarse?");
		int dias=entrada.nextInt();
		
		ventas = ventas*0.05;
		km= km*2;
		dias=30*dias;
		
		double sueldobruto= sueldo+ventas+km+dias;
		
		double sueldoneto=sueldobruto*0.82-36;
		
		System.out.println("Sueldo bruto: "+sueldobruto+" €.");
		System.out.println("Sueldo neto: "+sueldoneto+" €.");
		
		
		
	}

}
