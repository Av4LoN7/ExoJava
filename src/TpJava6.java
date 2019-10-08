
public class TpJava6 {

	public static void main(String[] args) {
		afficherFactor(10);
	}
	
	public static void afficherFactor(int nombre) {
		int f = 1;
		for(int i = 1; i <= nombre; i++) {
			f = f*i;
			System.out.println(f);
		}
	}

}
