package pg08;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("coordenada x");
		int x=sc.nextInt();
		System.out.println("coordenada y");
		int y=sc.nextInt();
		System.out.println("V/H");
		String vertical=sc.next();
		barco barco1=new barco(x,y,vertical);
		barco1.jugar();
		sc.close();
	}

	
		
}

class barco{
	
	private boolean vertical=true;
	private int barcoi;
	private int barcoj;
	
	
    public barco(int i,int j,String orientacion) {
    	barcoi=i;
    	barcoj=j;
    	char barcov=orientacion.toUpperCase().charAt(0);
    	if (barcov!='V') vertical=false;
    	if (barcoi>1 && vertical==false ||  barcoj>2 && vertical==true) 
    		throw new IllegalArgumentException("Barco mal colocado");
    }
    public void jugar() {
    	 int[][] oceano=new int[5][6];
    	 int tbarco=0;
		 int contador=0;
		 int intento=0;
		 int disparoi=0;
		 int disparoj=0;
		 Scanner sc=new Scanner(System.in);
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