package pg05;

import java.util.Arrays;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz= {1,2,3,4,5};
		
		
		Collections.shuffle(Arrays.asList(matriz));
		
		for (int i=0;i<matriz.length;i++) {
			System.out.println(matriz[i]);
		}
		
	}

}
