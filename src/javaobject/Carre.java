package javaobject;

public class Carre extends Rectangle {
	private Point a;
	
	public Carre(Point a, int c) {
		super(a, c, c);
		this.a = a;
	}	
	
	public String toString() {
		return "[CARRE [" + a.toString() + a.toString() + a.toString() + a.toString() + "]";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
}
