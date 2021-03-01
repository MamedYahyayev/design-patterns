package az.maqa.java.designpatterns.memento.model;

public class EditorState {
	private final String content;

	public EditorState(String prevContent) {
		this.content = prevContent;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "EditorState [content=" + content + "]";
	}

}
