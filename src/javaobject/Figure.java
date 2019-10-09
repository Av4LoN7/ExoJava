package javaobject;

import java.util.ArrayList;

public abstract class Figure {
	
	public abstract void affiche();
	
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
	protected Point p = FigureUtils.getRandomPoint();
	
	public abstract ArrayList<Point> getPoint();
	

	
}
