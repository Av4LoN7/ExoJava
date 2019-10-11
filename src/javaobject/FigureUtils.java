package javaobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FigureUtils {
	
	//protected static int rand = new Random().nextInt(100);
	
	
	public static Rond getRandomRond() {	
		return new Rond(getRandomPoint(), new Random().nextInt(10));
	}
	public static Rectangle getRandomRectangle() {
		return new Rectangle(getRandomPoint(),new Random().nextInt(10), new Random().nextInt(10));
	}
	public static Point getRandomPoint() {
		int rand = new Random().nextInt(10);
		return new Point(rand, rand);
	}
	public static Carre getRandomCarre() {
		return new Carre(getRandomPoint(), new Random().nextInt(10));
	}
	public static Segment getRandomSegment() {
		return new Segment(new Random().nextInt(10), true);
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
	
	/**
	 * create and return an ArrayList of xNumber of random figure 
	 * @param xNumber
	 * @return arrayList<Figure>
	 */
	public static ArrayList<Figure> genere(int xNumber) {
		
		ArrayList<Figure> figTempArray = new ArrayList<Figure>();
		for(int i =0; i < xNumber; i++) {
			figTempArray.add((Figure) getRandomFigure());
		}
		return figTempArray;
	}
	
	/**
	 * Check inside a Dessin if a figure exist from the given point parameter and return it (the figure)
	 * if duplicate return one
	 * if not return null
	 * @param p3
	 * @param de2 
	 * @return Figure / null
	 */
	public static Figure getFigureEn(Point p3, Dessin de2) {
		ArrayList<Figure> figTemp = new ArrayList<Figure>();
		for( Figure test: de2.getFigure()) {
			if(test.couvre(p3)) {
				figTemp.add(test);
			}
		}
		if(figTemp.size() >= 1) {
			return figTemp.get(0);
		} else {
			return null;
		}	
	}
	
	public static Collection<Figure> triProcheOrigine(Dessin de2){
		List<Figure> figTemp = new ArrayList<Figure>(de2.getFigure());
		Collections.sort(figTemp);
		return figTemp;
	}
	
	public static Collection<Figure> triDominant(Dessin de2){
			List<Figure> figTemp = new ArrayList<Figure>(de2.getFigure());
			List<Figure> indexTemp = new ArrayList<Figure>();
			for(Figure f : figTemp) {
				if(f.surface() > 0.0) {
					indexTemp.add(f);
				}
			}
			Collections.sort(indexTemp,  new Comparator<Figure>() {
				@Override
				public int compare(Figure o1, Figure o2) {
					return (int) (o1.surface() - o2.surface());
				};
		});
			return indexTemp;
	}
	
	public static Map<Integer, Figure> getRandomFigureInMap() {
		Map<Integer,Figure> figMap = new HashMap<Integer,Figure>();
		Figure temp = (Figure) FigureUtils.getRandomFigure();
		figMap.put(1, temp);
		return figMap;
	}
	
}
