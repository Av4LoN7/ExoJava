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
			str = " SEG [" + super.p.getX() + super.p.getY() + "] à " + "[" + (super.p.getX() + this.longueur)+ "," + super.p.getY() + "]";
		str = "SEG [" + super.p.getX() + "," + super.p.getY() + "] à " + "[" + super.p.getX() + "," + (super.p.getY() + this.longueur) + "]";
		str += " - Type : " + getType();
		return str;
	}
	
	@Override
	public void affiche() {
		System.out.println(this.toString());
		
	}

	@Override
	public String getType() {
		return super.getType();	
		}

}
