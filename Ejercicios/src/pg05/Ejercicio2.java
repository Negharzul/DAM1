package pg05;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		boolean vertical=true;
		int barcoi=0;
		int barcoj=0;
		
		do {
			
		
		 System.out.println("Introduzca coordenada x inicial:");
		 barcoi=sc.nextInt();
		 System.out.println("Introduzca coordenada y inicial:");
		 barcoj=sc.nextInt();
		 
		 System.out.println("Desea colocar el barco vertical u horizontalmente V/H");
		 char barcov=sc.next().toUpperCase().charAt(0);
		 if (barcov!='V') vertical=false;
		 if (barcoi>1 && vertical==false ||  barcoj>2 && vertical==true) System.out.println("Barco mal colocado");
		}while(barcoi>1 && vertical==false ||  barcoj>2 && vertical==true);
		
		
		
		
		 
		 int[][] oceano=new int[5][6];
		 int tbarco=0;
		 
		 for(int i=0;i<5;i++) {
			 //if(vertical==true && barcox==i) oceano[i]=1;
			 
			 for (int j=0;j<6;j++) {
				 if(vertical==false && barcoj==j && barcoi<=i && tbarco<=3) {
					 oceano[i][j]=1;
					 tbarco++;
				 }else if (vertical==true && barcoi==i &&barcoj<=j && tbarco<=3) {
					 oceano[i][j]=1;
					 tbarco++;
				 } else oceano[i][j]=0;
				 
				 
				  }
			  }
		 
	
		 int contador=0;
		 int intento=0;
		 int disparoi=0;
		 int disparoj=0;
		 
		 do {
			 do {
				 
			 
		 System.out.print("Dispara a la casilla x(0-4): ");
		 disparoi=sc.nextInt();
		 System.out.println("y(0-5):");
		 disparoj=sc.nextInt();
		 if(disparoi>4 || disparoj>5)System.out.println("Coordenadas incorrectas");
			 }while (disparoi>4 ||disparoj>5);
		 
		 if (oceano[disparoi][disparoj]==1) {
			 System.out.println("Tocado");
			 contador++; 
			 oceano[disparoi][disparoj]=2;
		 }else if(oceano[disparoi][disparoj]==2) System.out.println("Ya disparaste ahi");
		 else System.out.println("Agua");
		 
		 intento++;
		 }while(contador<4 && intento<8);
		 
		 if (intento<8) System.out.print(" y hundido."); else System.out.println("Perdiste.");
		 
		 for (int i=5;i>=0;i--) {
			 System.out.println();
			 for (int j=0;j<5;j++) {
				 if (oceano[j][i]==0)System.out.print("~ ");
				 else if (oceano[j][i]==2) System.out.print("X ");
				 else System.out.print("* ");
				
			 }
		 }
		 
		  sc.close();
	}

}
