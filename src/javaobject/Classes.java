package javaobject;

import java.time.*;
import java.util.Map;

public class Classes {

	public static void main(String[] args) {
		Point a = new Point(8,8);
		Rond b = new Rond(a,15);
		Rectangle r = new Rectangle(a, 0,15);
				
		Rectangle test = FigureUtils.getRandomRectangle();
		Rond test2 = FigureUtils.getRandomRond();
		Point test3 = FigureUtils.getRandomPoint();
	
		System.out.println(a.toString());
		b.affiche();
		r.affiche();
		
		System.out.println("\nRandom -----");
		test.affiche();
		test2.affiche();
		System.out.println(test3.toString());
		
		System.out.println("\nCarre ------");
		Carre c = new Carre(FigureUtils.getRandomPoint(), 10);
		System.out.println(c.toString());
		
		Point te1 = new Point(2,3);
		Point te2 = new Point(2,3);
		System.out.println(te1.isEqual(te2));
		
		System.out.println("\nFigure random------");
		Object o = FigureUtils.getRandomFigure();
		if(o instanceof Carre )
			((Carre) o).affiche();
		else if(o instanceof Rond )
			((Rond) o).affiche();
		else if(o instanceof Rectangle )
			((Rectangle) o).affiche();
		else
			((Segment) o).affiche();
		
		System.out.println("\nSurface -----");
		System.out.println(FigureUtils.getRandomSurfacable());
		
		System.out.println("\nTableau de point -----");
		System.out.println("\nRond --");
		System.out.println(b.getPoint());
		
		Segment seg1 = FigureUtils.getRandomSegment();
		System.out.println(seg1.getPoint());
		
		Rectangle rect2 = FigureUtils.getRandomRectangle();
		System.out.println(rect2.getPoint());
		System.out.println(c.getPoint());
		
		
		Figure[] f =  new Figure[4];
		
		Figure figPoint = (Figure) FigureUtils.getRandomFigure();
		Figure figPoint2 = (Figure) FigureUtils.getRandomFigure();
		
		for(int i = 0; i < f.length; i++) {
			f[i] = (Figure) FigureUtils.getRandomFigure();
		}
		System.out.println("\nTableau de figure + ellipse -----");
		System.out.println(FigureUtils.getPoint(f));
		System.out.println(FigureUtils.getPoint(figPoint, figPoint2));
		
		System.out.println("\nCollection de figure -----");
		Dessin des = new Dessin();
		System.out.println(des.getFigure());
		
		System.out.println("\nIterator sur dessin------");
		System.out.println(FigureUtils.getFigureEn(FigureUtils.getRandomPoint(), des));
		
		System.out.println("\nComparable + distance ----");
		System.out.println(test3.distance(test2.p));
		System.out.println(rect2.distanceOrigine());
		System.out.println(seg1.distanceOrigine());
		System.out.println(des.getFigure());
		System.out.println(FigureUtils.triProcheOrigine(des));
		System.out.println("\nSurface ----");
		System.out.println(FigureUtils.triDominant(des));
		
		System.out.println("\nDate et test de date ----- ");
		LocalDate dateAnniv = LocalDate.of(1984, 7, 7);
		LocalDate now = LocalDate.now();
		Period p = Period.between(dateAnniv, now);
		System.out.println(p.getYears());
		System.out.println("\nMap Collection");
		Map<String, Figure> testMap = FigureUtils.getRandomFigureInMap();
		System.out.println(testMap);
		System.out.println(FigureUtils.getId("1", testMap));
		
		
	}

}
