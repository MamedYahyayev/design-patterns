package az.maqa.java.designpatterns.memento.main;

import az.maqa.java.designpatterns.memento.model.Editor;
import az.maqa.java.designpatterns.memento.model.History;

public class Main {

	public static void main(String[] args) {
		Editor editor = new Editor();
		History history = new History();

		editor.setContent("First Value");
		history.push(editor.createState());

		editor.setContent("Second Value");
		history.push(editor.createState());

		editor.setContent("Third Value");

		try {
			editor.restoreState(history.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(editor.getContent());
	}

}
