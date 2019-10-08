package javaobject;


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

	}

}
