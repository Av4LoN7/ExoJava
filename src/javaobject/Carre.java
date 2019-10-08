package javaobject;

public class Carre extends Rectangle implements Surfacable{
	
	public Carre(Point a, int c) {
		super(a, c, c);
	}	
	
	public String toString() {
		return "[CARRE [" + super.p.toString() + super.p.toString() + super.p.toString() + super.p.toString() + "]" + " rayon : " + surface();
	}
	
	
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
	public double surface() {
		return (super.p.getY() * super.p.getX());
	}
	
	@Override
	public Point[] getPoint() {
		Point[] pCarre = { p, getPointHautGauche(), getPointHautDroit(), getPointBasDroit() };
		return pCarre;
	}
	
}
