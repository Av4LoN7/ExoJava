package javaobject;

import java.util.ArrayList;


public class Dessin {
	
	private ArrayList<Figure> figArray = new ArrayList<Figure>();

	public Dessin() {
		this.figArray = FigureUtils.genere(10);
	}
	public boolean addFigure(Figure f) {
		return figArray.add(f);
	}
	
	/**
	 * Return an arrayList of Figure because duplicate is authorized and the list can be reused when needed
	 * @return ArrayList<Figure>
	 */
	public ArrayList<Figure> getFigure(){
		return figArray;
	}
}
