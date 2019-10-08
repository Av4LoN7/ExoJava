import java.util.Arrays;

public class TpjavaTriBulle {

	public static void main(String[] args) {
		int[] tableau = {2,5,4,6,88,12,57,14,3, 0};
		
		
		// tri a bulle (2 version)
		
		/*for(int i = tableau.length; i >=1 ; i--) {
			for( int j = 2; j < i; j++) {
				if(tableau[j-1] > tableau[j]) {
					int temp = tableau[j-1];
					tableau[j-1] = tableau[j];
					tableau[j] = temp;
				}
			}
		}*/
		
		/*int size = tableau.length;
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			for(int i=0; i < size-1; i++) {
				if(tableau[i] > tableau[i +1]) {
					int temp = tableau[i];
					tableau[i] = tableau[i+1];
					tableau[i+1] = temp;
					sorted = false;
				}
			}
			size--;
		}
		
		for(int v = 0; v < tableau.length; v++) {
			System.out.println(tableau[v]);
		}*/
	
		
		// tri selectif
		/*int[] tab2 = new int[tableau.length];
		
		for(int i = 0; i < tableau.length; i++) {		
			Arrays.sort(tableau);
			tab2[i] = tableau[i];
		}
		for(int v = 0; v < tab2.length; v++) {
			System.out.println(tab2[v]);
		}*/
       
		/*for(int i = 1; i < tableau.length; i++) {
			int index = tableau[i];
			int j = i-1;
			while((tableau[j] > index) && j < - 1) {
				tableau[j+1] = tableau[j];
				j--;
			}
			tableau[j+1] = index;
			System.out.println(tableau[i]);
			System.out.println(tableau[j]);
		}*/
		for(int v = 0; v < tableau.length; v++) {
			System.out.println(tableau[v]);
		}
	

			

		}


}
