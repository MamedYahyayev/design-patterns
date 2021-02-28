package az.maqa.java.designpatterns.factory.model;

public enum HamburgerType {

	VEGGIE("veggie"), CHEESE("cheese");

	private String type;

	HamburgerType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
