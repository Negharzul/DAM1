package pg04;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz=new int[2][3];
		
		Scanner sc=new Scanner(System.in);
		
		
		
		for (int i=0;i<=1;i++) for (int j=0;j<=2;j++) {
				System.out.println("Introduce numero ["+i+"]["+j+"].");
				
				matriz [i][j]=sc.nextInt();
			}
			
		int mayor= matriz[0][0];
		int menor= matriz[0][0];
		int imayor=0;
		int jmayor=0;
		int imenor=0;
		int jmenor=0;
		
		for (int i=0;i<=1;i++) for (int j=0;j<=2;j++) {
			if(mayor<matriz[i][j]) {
				mayor=matriz[i][j];
				imayor=i;
				jmayor=j;
			}
			if(menor>matriz[i][j]) {
				menor=matriz[i][j]; 
				imenor=i;
				jmenor=j;
			}
			
		}
		System.out.println("El numero mayor es "+mayor+" y está en la posición ["+imayor+"]["+jmayor+"].");
		System.out.println("El numero menor es "+menor+" y está en la posición ["+imenor+"]["+jmenor+"].");
		
		sc.close();
		
		}

}
