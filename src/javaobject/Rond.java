package javaobject;

import java.util.ArrayList;

public class Rond extends Figure implements Surfacable {

	private int b, r;

	public Rond(Point a, int b) {
		this.b = b;
		setR();
	}

	public int getR() {
		return this.r;
	}

	public void setR() {
		this.r = b / 2;
	}

	public String toString() {
		return "[ROND [" + p.getX() + "," + p.getY() + "], " + this.r + "] - Type: " + getType() + " rayon : " + surface();
	}

	public void affiche() {
		System.out.println(toString());
	}

	@Override
	public double surface() {
		return ((this.r * this.r) * 3.14);
	}

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> tabR = new ArrayList<Point>();
		tabR.add(p);
		return tabR;
	}

	@Override
	public boolean couvre(Point p2) {
		return (p.getX() == p2.getX() && p.getY() == p2.getY());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + b;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Rond)) {
			return false;
		}
		Rond other = (Rond) obj;
		if (b != other.b) {
			return false;
		}
		if (r != other.r) {
			return false;
		}
		return true;
	}
	
}
