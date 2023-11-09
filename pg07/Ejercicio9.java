package pg07;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {40,71,52,10,2,97,8,6,13,33,31,14};
		System.out.println(media(n));
		
		double[] n2= {40,71,52,10,2,97,8,6,13,33,31,14};
		System.out.println(media(n2));
	}

	private static double media(int datos[]) {
		int total=0;
		for (int i=0;i<datos.length;i++) total+=datos[i];
		double media= (double)total/datos.length;
		return media;
	}
	
	private static double media(double datos[]) {
		int total=0;
		for (int i=0;i<datos.length;i++) total+=datos[i];
		double media= (double)total/datos.length;
		return media;
		
	}
}
