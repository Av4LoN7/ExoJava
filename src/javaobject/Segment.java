package javaobject;


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
	
	public int getLPoint() {
		return new Point()
	}
	
	
	@Override
	public void affiche() {
		System.out.println(this.toString());
		
	}

	@Override
	public String getType() {
		return getType();	
		}

	@Override
	public Point[] getPoint() {
	
		Point[] pSegment = { p, new Point() };
		
		return null;
		
	}

}
