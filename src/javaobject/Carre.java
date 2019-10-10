package javaobject;

import java.util.ArrayList;

public class Carre extends Rectangle implements Surfacable{
	
	public Carre(Point a, int c) {
		super(a, c, c);
	}	
	
	public String toString() {
		return "[CARRE [" + p.toString() + p.toString() + p.toString() + p.toString() + "]" + " rayon : " + surface();
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
	public double surface() {
		return (p.getY() * p.getX());
	}
	
	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> pCarre = new ArrayList<Point>();
		pCarre.add(p);
		pCarre.add(getPointHautGauche());
		pCarre.add(getPointHautDroit());
		pCarre.add(getPointBasDroit());
		return pCarre;
	}
	
	
}
