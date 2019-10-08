
public class TpJava5 {

	public static void main(String[] args) {
		afficherN(10);
	}
	
	public static void afficherN(int nombre) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while(i < nombre);
	}

}
