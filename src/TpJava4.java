
public class TpJava4 {

	public static void main(String[] args) {
		reduction(550);
	}
	
	public static void reduction(float prix) {
		System.out.print(prix + " => ");
		if(prix >= 5000) {
			System.out.println(prix * 5/100);
		}
		else if(prix < 5000 && prix >= 2000) {
			System.out.println(prix * 3/100);
		}
		else if( prix < 2000 && prix >= 1000) {
			System.out.println(prix * 1/100);
		}
		else {
			System.out.println("Pas de reduction");
		}
	}

}
