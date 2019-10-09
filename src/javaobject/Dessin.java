package javaobject;

import java.util.ArrayList;


public class Dessin {
	
	private ArrayList<Figure> figArray;

	public Dessin() {
		this.figArray = new ArrayList<Figure>();
	}
	public boolean addFigure(Figure f) {
		return figArray.add(f);
	}
	
	/**
	 * Return an arrayList of Figure because doublon is authorized and the list can be reused wen needed
	 * @return ArrayList<Figure>
	 */
	public ArrayList<Figure> getFigure(){
		return figArray;
	}
}
