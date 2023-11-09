package dam1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("año: ");
		int año=sc.nextInt();
		
		System.out.print("mes: ");
		int mes=sc.nextInt();
		
		System.out.print("dia: ");
		int dia=sc.nextInt();
		
		boolean fecha=true;
	    
		dia++;
		if (dia==31) {
			mes++;
			dia=1;
		}else if (dia>31) fecha=false;
		
		
		
		
		if (mes==13) {
			año++;
			mes=1;
		}else if(mes>13) fecha=false;
		
		if (fecha==false) System.out.println("Fecha incorrecta"); 
		else System.out.println("Mañana sera "+dia+"/"+mes+"/"+año );
				
		
	}

}
