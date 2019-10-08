
public class TjJava2bis {

	public static void main(String[] args) {
		reduction(4500, 2);
	
	}
	
	public static void reduction(float prix, int poids) {
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
		
		switch (poids) {
		case 1:
			System.out.println("petit");
			break;
		case 2:
			System.out.println("moyen");
			break;
		default:
			System.out.println("grand");
			break;
		}
	}


}
