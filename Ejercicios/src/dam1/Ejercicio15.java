package dam1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("año: ");
		int anno=sc.nextInt();
		
		System.out.print("mes: ");
		int mes=sc.nextInt();
		
		System.out.print("dia: ");
		int dia=sc.nextInt();
		
		boolean fecha=true;
		
		dia++;
		switch (mes){
			
		case 1,3,5,7,8,10,12: if (dia==32) {
			mes++;
			dia=1;
		}else if(dia>32)fecha=false;
		break;
			
		case 2: if (dia==29) {
			mes++;
			dia=1;
		}else if (dia>29) fecha=false; 
		break;
			
		default: if(dia==31) {
			mes++;
			dia=1;
		}else if(dia>31)fecha=false; 
		break; 
		}
		
		if (mes==13) {
			anno++;
			mes=1;
		}else if (mes>13) fecha=false;
		
		if (fecha==false) System.out.println("Fecha incorrecta");
		else System.out.println("mañana sera: "+dia+"/"+mes+"/"+anno);
		
		
		
		
	}

}
