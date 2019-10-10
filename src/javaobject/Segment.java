package javaobject;

import java.util.ArrayList;

public class Segment extends Figure{
	
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
	
	public int getFin(int value) {
		return value + this.longueur;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Segment)) {
			return false;
		}
		Segment other = (Segment) obj;
		if ( p.getX() != other.p.getX()) {
			return false;
		}
		if ( p.getY() != other.p.getY()) {
			return false;
		}
		if(this.getFin(this.longueur) != other.getFin(other.longueur)) {
			return false;
		}
		return true;
	}

	@Override
	protected double distanceOrigine() {
		// to do return the smallest distance
		ArrayList<Point> pTemp = new ArrayList<Point>();
		pTemp = FigureUtils.getPoint((Figure) this);
		double resultat = 0;
		for(Point p2 : pTemp) {
			resultat = p2.distance(p);
		}
		return resultat;
		
		/*String beforeConv = pTemp2.get(0).getX() + "." + pTemp2.get(0).getY();
		Double finalDouble = Double.parseDouble(beforeConv);
		return finalDouble;*/
	}
	
}
