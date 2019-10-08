package javaobject;

public class Point {
	private int x, y;
	private final int INIT_X = 25;
	private final int INIT_Y = 25;
	
	public Point() {
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return "[" + this.x + "," + this.y + "]";
	}
	
	public boolean isEqual(Point b) {
		return ( (this.getX() == b.getX()) && this.getY() == b.getY());
	}
	
	
	
	
}
