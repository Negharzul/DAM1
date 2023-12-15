package examen01;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crea el metodo static boolean haGanado(char[][]m,int fila, int columna,char caracter) { que comprueba si un jugador con su jugada gana una partida de 3 en raya
		
		
	}

	static boolean haGanado(char[][]m,int fila, int columna,char caracter) {
		int contadorHorizontal=0;
		int contadorVertical=0;
		for(int i=0;i<3;i++) {
			if(m[fila][i]==caracter) contadorHorizontal++;
			
		}
		if(contadorHorizontal==3) return true;
		
		for(int i=0;i<3;i++) {
			if(m[i][columna]==caracter) contadorVertical++;
		}
		if(contadorVertical==3) return true;
		
		if(m[1][1]==caracter) {
			if(m[0][2]==caracter && m[2][0]==caracter) return true;
			if(m[0][0]==caracter && m[2][2]==caracter) return true;
		}
		
		
		
		return false;
	}
	
}
