package javaobject;

import java.util.ArrayList;

public class Segment extends Figure {
	
	private int longueur;
	private boolean horizontale;
	
	public Segment( int longueur, boolean horizontale) {
		this.longueur = longueur;
		this.horizontale = horizontale;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongeur(int longeur) {
		this.longueur = longeur;
	}

	public boolean isHorizontale() {
		return horizontale;
	}

	public void setHorizontale(boolean horizontale) {
		this.horizontale = horizontale;
	}

	public String toString() {
		String str ="";
		if(this.horizontale)
			str = " SEG [" + p.getX() + p.getY() + "] à " + "[" + (p.getX() + this.longueur)+ "," + p.getY() + "]";
		str = "SEG [" + p.getX() + "," + p.getY() + "] à " + "[" + p.getX() + "," + (p.getY() + this.longueur) + "]";
		str += " - Type : " + getType();
		return str;
	}
	
	/**
	 * 
	 * @return
	 */
	public Point getOtherPoint() {
		Point temp = null;
		if(this.horizontale) {
			temp = new Point();
			temp.setX( (p.getX() + this.longueur));
			temp.setY( p.getY());
		}
		else {
			temp = new Point();
			temp.setY( (p.getY() + this.longueur));
			temp.setX( p.getX());
		}
		return temp;
	}
	
	
	@Override
	public void affiche() {
		System.out.println(this.toString());
		
	}

	@Override
	public String getType() {
		return super.getType();	
		}

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> pSegment = new ArrayList<Point>();
		pSegment.add(p);
		pSegment.add(getOtherPoint());
		return pSegment;
		
	}

	@Override
	public boolean couvre(Point p2) {
		return (p.getX() == p2.getX() && p.getY() == p2.getY());
	}

}
