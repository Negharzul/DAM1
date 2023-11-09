import java.util.Scanner;

public class Zera_Billetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce cantidad deseada");
		
		int dinero=entrada.nextInt();
		
		int cien;
		int  veinte;
		int cinco;
		int uno;
		int resto;
		int resto2;
		int resto3;
		
		cien= dinero/100;
		resto = dinero%100;
		
		veinte =resto/20;
		resto2= resto%20;
		
		cinco= resto2/5;
		resto3= resto2%5;
		
		uno = resto3;
		
		
		System.out.println("necesitaras "+cien+" billetes de 100 "
		+veinte+" billetes de 20 "+cinco+" billetes de 5 y "+uno+" monedas");
		
	
	}

}
