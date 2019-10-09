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
}
