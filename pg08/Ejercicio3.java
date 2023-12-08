package pg08;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tablero=new int[8][8];
		int turno=0;
		boolean perder=false;
		
		InsertarMinas(tablero);
		
		do {
		mostrarCampo(tablero);
		perder=intento(tablero);
		if(perder==true) {
			System.out.println("Pisaste una mina.");
			reset(tablero);
			turno++;
			perder=false;
		}
		}while(ganar(tablero)==false && turno<3);

		if(ganar(tablero)==true) System.out.println("¡¡Felicidades ganaste!!");
		else System.out.println("Perdiste.");
		completarCampo(tablero);
		mostrarCampo(tablero);
		

				 
		
		
	}

	static void InsertarMinas(int[][] frame ){
		int numero;
		int contador=0;
		for (int i=0;i<6;i++) {
			do {
				numero=(int) (Math.random()*64);
				if(frame[numero/8][numero%8] !=1) {
					frame[numero/8][numero%8]=1;
					contador++;
			}
			}while(contador==i);
		}
	}
	static void mostrarCasillasAdyacentes(int frame[][],int x,int y) {
		
		if (frame[x][y]==0) frame[x][y]=2;
		if (y<7)if (frame[x][y+1]==0) frame[x][y+1]=2;
		if (y>0)if (frame[x][y-1]==0) frame[x][y-1]=2;
		
		if(x<7) {
			if (frame[x+1][y]==0) frame[x+1][y]=2;
			if (y<7)if (frame[x+1][y+1]==0) frame[x+1][y+1]=2;
			if (y>0)if (frame[x+1][y-1]==0) frame[x+1][y-1]=2;	
		}

		if(x>0) {
			if (frame[x-1][y]==0) frame[x-1][y]=2;
			if (y<7)if (frame[x-1][y+1]==0) frame[x-1][y+1]=2;
			if (y>0)if (frame[x-1][y-1]==0) frame[x-1][y-1]=2;
		}	
		
		
		if (frame[x][y]==1) frame[x][y]=3;
		if (y<7)if (frame[x][y+1]==1) frame[x][y+1]=3;
		if (y>0)if (frame[x][y-1]==1) frame[x][y-1]=3;
		
		if(x<7) {
			if (frame[x+1][y]==1) frame[x+1][y]=3;
			if (y<7)if (frame[x+1][y+1]==1) frame[x+1][y+1]=3;
			if (y>0)if (frame[x+1][y-1]==1) frame[x+1][y-1]=3;	
		}

		if(x>0) {
			if (frame[x-1][y]==1) frame[x-1][y]=3;
			if (y<7)if (frame[x-1][y+1]==1) frame[x-1][y+1]=3;
			if (y>0)if (frame[x-1][y-1]==1) frame[x-1][y-1]=3;
		}		
	}
	static boolean intento(int[][]frame) {
		Scanner sc=new Scanner(System.in);
		boolean perder =false;
		boolean salir= false;
		int x,y;
		

		do {
			do {
				System.out.print("Coordenada x(1-8): ");
				x=sc.nextInt()-1;
				System.out.print("Coordenada y(1-8): ");
				y=sc.nextInt()-1;
				if(x<0 || x>7 || y<0 || y>7) System.out.println("Coordenada incorrecta.");
			}while(x<0 || x>7 || y<0 || y>7);
			
			
			if(frame[x][y]==2||frame[x][y]==3) System.out.println("Casilla ya abierta elige otra.");
			else if(frame[x][y]==1) {
				perder=true;
				salir=true;
			}
			else {
				mostrarCasillasAdyacentes(frame, x, y);
				salir=true;
			}
			
		}while(salir==false);
	
		return perder;
	}
	static void mostrarCampo(int[][] tablero) {
		for (int i=7;i>=0;i--) {
			 System.out.println();
			 for (int j=0;j<8;j++) {
				if(tablero[j][i]==0 || tablero[j][i]==1) System.out.print("◼ ");
				else if(tablero[j][i]==2) System.out.print("◻ ");
				else if(tablero[j][i]==3) System.out.print("* ");
				 					
					 }
				 }
		System.out.println();
	}
	static boolean ganar (int[][] tablero) {
		int contarMinas=0;
		for (int i=0;i<8;i++) for (int j=0;j<8;j++)  if (tablero[i][j]==3) contarMinas++;
				
		return contarMinas==6;	
	}
	static void reset(int[][] tablero) {
		for (int i=0;i<8;i++) for(int j=0;j<8;j++) {
			if(tablero[i][j]==2) tablero[i][j]=0;
			if(tablero[i][j]==3) tablero[i][j]=1;
		}
		
	}
	static void completarCampo(int[][]tablero){
		for(int i=0;i<tablero.length;i++) 
		for (int j=0;j<tablero[i].length;j++) {
				if(tablero[i][j]==0) tablero[i][j]=2;
				else if(tablero[i][j]==1) tablero[i][j]=3;
					
			}
		}
	
}
