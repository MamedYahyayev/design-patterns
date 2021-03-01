package az.maqa.java.designpatterns.memento.model;

import java.util.ArrayList;
import java.util.List;

public class History {

	private List<EditorState> states = new ArrayList<EditorState>();

	public void push(EditorState state) {
		if (state != null) {
			states.add(state);
			System.out.printf("%s added to state list\n", state);
		} else {
			throw new NullPointerException("State cannot be null");
		}
	}

	public EditorState pop() throws Exception {
		int lastIndex = states.size() - 1;
		EditorState lastState = states.get(lastIndex);
		if (lastState != null) {
			states.remove(lastState);
			System.out.printf("%s removed from list\n", lastState);
			return lastState;
		} else {
			throw new Exception("State not found on the list");
		}
	}

}
