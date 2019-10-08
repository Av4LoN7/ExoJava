package javaobject;

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
		return "[ROND [" + super.p.getX() + "," + super.p.getY() + "], " + this.r + "] - Type: " + super.getType() + " rayon : " + surface();
	}

	public void affiche() {
		System.out.println(toString());
	}

	@Override
	public double surface() {
		return ((this.r * this.r) * 3.14);
	}

	@Override
	public Point[] getPoint() {
		Point[] tabR = { super.p };
		return tabR;
	}
}
