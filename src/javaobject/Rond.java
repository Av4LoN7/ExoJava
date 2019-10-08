package javaobject;

public class Rond extends Figure {

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
		return "[ROND [" + super.p.getX() + "," + super.p.getY() + "], " + this.r + "] - Type: " + super.getType();
	}

	public void affiche() {
		System.out.println(toString());
	}
}
