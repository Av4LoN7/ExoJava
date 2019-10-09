package javaobject;

import java.util.ArrayList;
import java.util.Random;

public class FigureUtils {
	
	protected static int rand = new Random().nextInt(100);
	
	
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
	
	
	public static ArrayList<Point> getPoint(Figure... f) {
		/*int total = 0;
		for(int i = 0; i < f.length; i++) {
			Point[] pointTemp;
			pointTemp = f[i].getPoint();
			total += pointTemp.length;
		}*/

		ArrayList<Point> tempList = new ArrayList<Point>();

		for(int i = 0; i < f.length ; i++) {
			ArrayList<Point> pointTemp;
			pointTemp = f[i].getPoint();
			tempList.addAll(pointTemp);
		}
		return tempList;
	}
	
	public static ArrayList<Figure> genere(int xNumber) {
		
		ArrayList<Figure> figTempArray = new ArrayList<Figure>();
		for(int i =0; i < xNumber; i++) {
			figTempArray.add((Figure) getRandomFigure());
		}
		return figTempArray;
	}
	
	
	

}
