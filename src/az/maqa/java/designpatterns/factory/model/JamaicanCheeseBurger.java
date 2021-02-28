package az.maqa.java.designpatterns.factory.model;

public class JamaicanCheeseBurger extends Hamburger {

	public JamaicanCheeseBurger() {
		super.setName("Jamaican Cheese Burger");
		super.setSauce("Spicy Jamaican Sauce");
		super.setBuns("Cookie dough buns!");
	}

	@Override
	public void cook() {
		System.out.println("Cooking Jamaican Style...");
	}

}
