package javaobject;

public class Point {
	private int x, y;
	protected final int INIT_X = 25;
	protected final int INIT_Y = 25;
	
	public Point() {
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	public Point(int a, int b) {
		setX(a);
		setY(b);
	}
	
	public void setX(int a) {
		this.x = a;
	
	}
	
	public void setY(int b) {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	public double distance(Point p2) {
		if(this.x < p2.getX()) {
			System.out.println(p2.getX());
			System.out.println(this.getX());
			return ( (p2.getX() - this.x));	
		}
		return 0.0;
			
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}*/
	
	
	
	
}
