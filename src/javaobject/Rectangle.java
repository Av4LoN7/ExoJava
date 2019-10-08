package javaobject;

public class Rectangle extends Figure implements Surfacable{
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
		return new Point((super.p.getX() + 12) , (super.p.getY()));
	}
	public Point getPointHautGauche() {
		return new Point(super.p.getX(), (super.p.getY() + 10 ));
	}
	public Point getPointHautDroit() {
		return new Point( (super.p.getX() + 12), (super.p.getY() + 10));
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
	public Point[] getPoint() {
		Point[] pRect = { p, getPointHautGauche(), getPointHautDroit(), getPointBasDroit() };
		return pRect;
	}
	

}
