package az.maqa.java.designpatterns.state.model;

public class Selection implements Tool {

	@Override
	public void mouseUp() {
		System.out.println("Selection Icon");
	}

	@Override
	public void mouseDown() {
		System.out.println("Drawing a dashed rectangle");
	}

}
