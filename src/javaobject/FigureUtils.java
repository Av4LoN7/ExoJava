package javaobject;

import java.util.Random;

public class FigureUtils {
	
	protected static int rand = (int) (Math.random() * (10 - 1));
	
	
	public static Rond getRandomRond() {	
		return new Rond(getRandomPoint(), rand);
	}
	public static Rectangle getRandomRectangle() {
		return new Rectangle(getRandomPoint(),rand, rand);
	}
	public static Point getRandomPoint() {
		return new Point(rand, rand);
	}
	public static Carre getRandomCarre() {
		return new Carre(getRandomPoint(), rand);
	}
	public static Segment getRandomSegment() {
		return new Segment(rand, true);
	}
	
	/**
	 * Create an random figure based on random selection
	 * @return object type rectangle / carre or rond
	 */
	public static Object getRandomFigure() {
		int f = new Random().nextInt(4);
		Object o = null;
		
		switch(f) {
		case 0:
			 o = FigureUtils.getRandomRond();
			break;
		case 1:
			 o = FigureUtils.getRandomRectangle();
			break;
		case 2:
			 o = FigureUtils.getRandomCarre();
			break;
		case 3:
			o = FigureUtils.getRandomSegment();
		}
		return  o;
	}
	
	/**
	 * Create a random figure then return the surface value
	 * @return double the surface value 
	 */
	public static double getRandomSurfacable() {
		Object o = getRandomFigure();
		double temp = 0.0;
		
		switch(o.getClass().getSimpleName()) {
		case "Rond":
			temp = ((Rond) o).surface();
			break;
		case "Rectangle":
			temp = ((Rectangle) o).surface();
			break;
		case "Carre":
			temp = ((Carre) o).surface();
			break;
		}
		return temp;
	}
	
	public static Point[] getPoint(Figure[] f) {
		
		return null;
	}
	
	

}
