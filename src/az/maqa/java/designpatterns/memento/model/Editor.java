package az.maqa.java.designpatterns.memento.model;

public class Editor {

	private String content;

	public EditorState createState() {
		return new EditorState(content);
	}

	public void restoreState(EditorState state) {
		content = state.getContent();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Editor [content=" + content + "]";
	}

}
