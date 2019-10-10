package javaobject;

import java.util.ArrayList;

public abstract class Figure implements Comparable<Figure> {
	
	public abstract void affiche();
	
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
	protected Point p = FigureUtils.getRandomPoint();
	
	protected abstract ArrayList<Point> getPoint();
	
	protected abstract boolean couvre(Point p2);
	
	protected abstract double distanceOrigine();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Figure)) {
			return false;
		}
		Figure other = (Figure) obj;
		if (p == null) {
			if (other.p != null) {
				return false;
			}
		} else if (!p.equals(other.p)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Figure o) {
		return (int) ( this.distanceOrigine() - o.distanceOrigine());
	}

	
	
	
	

	
}
