package zera;

public class Companiero {

	//Los dos métodos al final del código son materiales aportados por el ED.
    public static void main(String[] args) {
    	 
    	 int [] array1= {1,2,4,3};
    	 for (int i=0;i<array1.length;i++) System.out.print("|"+array1[i]);
    	 System.out.println("|");
    	 intercambio1(array1);
    	 for (int i=0;i<array1.length;i++) System.out.print("|"+array1[i]);
    	 System.out.println("|");
    	 int a=1;
    	 int b=2;
    	 
    	 intercambio2(a,b);
    	 System.out.println(a+"|"+b);
    	 
    	
    	 
    	 for (int i=0;i<array1.length;i++) System.out.print("|"+array1[i]);
    	 System.out.println("|");
    	 //El primer método intercambia la primera posición del array por la segunda.
    	 
    	 
    	 int num1=3; int num2=2; int suma=num1+num2;
    	 System.out.println("Podríamos decir que "+num1+" + "+num2+" son "+suma+".");
    	 System.out.println("num1 vale "+num1+"\nnum2 vale "+num2);
    	 intercambio2(num1, num2); //Por algún motivo no funciona.
    	 //Si el código de abajo deja de ser comentario va a la perfección haciendo lo que se supone que hace el método.
    	 	//int aux = num1; 
     		//num1 = num2; 
     		//num2=aux;
    	 System.out.println("Podríamos decir que "+num1+" + "+num2+" son "+suma+".");
    	 System.out.println("num1 vale "+num1+"\nnum2 vale "+num2);
    	 //Y en este último código no se ha intercambiado nada.
    }
    
    private static void intercambio1(int[] datos) {
         int aux = datos[0]; 
         datos[0] = datos[1]; 
         datos[1] = aux;
    }
     static void intercambio2(int a, int b) {
    	int aux = a; 
    	a = b; 
    	b=aux;
    }  
}