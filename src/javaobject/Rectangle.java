package javaobject;

import java.util.ArrayList;

public class Rectangle extends Figure implements Surfacable, Comparable<Figure>{
	protected int a, b;

	public Rectangle(Point p, int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Point getPointBasGauche() {
		return super.p;
	}
	public Point getPointBasDroit() {
		return new Point((p.getX() + 12) , (p.getY()));
	}
	public Point getPointHautGauche() {
		return new Point(p.getX(), (p.getY() + 10 ));
	}
	public Point getPointHautDroit() {
		return new Point( (p.getX() + 12), (p.getY() + 10));
	}

	public String toString() {
		return "[RECT " + getPointBasGauche() + getPointHautGauche() + getPointHautDroit() + getPointBasDroit() + "] - Type : " + super.getType();
	}
	
	public void affiche() {
		System.out.println(toString());
	}

	@Override
	public double surface() {
		return getPointHautDroit().getX() * getPointHautDroit().getY();
	}

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> pRect = new ArrayList<Point>();
			pRect.add(p);
			pRect.add(getPointHautGauche());
			pRect.add(getPointHautDroit());
			pRect.add(getPointBasDroit());
		return pRect;
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
		if (!(obj instanceof Rectangle) && !(obj instanceof Carre)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if(this.getPointBasGauche() != other.getPointBasGauche()) {
			return false;
		}
		if(this.getPointBasDroit() != other.getPointBasDroit()) {
			return false;
		}
		if(this.getPointHautDroit() != other.getPointHautDroit()) {
			return false;
		}
		if(this.getPointHautGauche() != other.getPointHautGauche()) {
			return false;
		}
		return true;
	}

	@Override
	protected double distanceOrigine() {
		ArrayList<Point> pTemp = new ArrayList<Point>();
		pTemp = FigureUtils.getPoint((Figure) this);
		ArrayList<Point> pTemp2 = new ArrayList<Point>();
		for(Point p2 : pTemp) {
			if( p2.getX() < p.INIT_X && p2.getY() < p.INIT_Y) {
				pTemp2.add(p2);
			}
		}
		return pTemp2.get(0).getX() - p.getX();
		/*String beforeConv = pTemp2.get(0).getX() + "." + pTemp2.get(0).getX();
		Double finalDouble = Double.parseDouble(beforeConv);
		return finalDouble;*/
	}

	@Override
	public int compareTo(Figure o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
