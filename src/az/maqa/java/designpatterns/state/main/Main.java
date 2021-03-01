package az.maqa.java.designpatterns.state.main;

import az.maqa.java.designpatterns.state.model.Canvas;
import az.maqa.java.designpatterns.state.model.Selection;

public class Main {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.setCurrentTool(new Selection());
		canvas.mouseUp();
	}

}
