package az.maqa.java.designpatterns.factory.model;

public class JamaicanVeggieBurger extends Hamburger {

	public JamaicanVeggieBurger() {
		super.setName("Jamaican Veggie Burger");
		super.setSauce("Spicy Veggie Sauce");
		super.setBuns("Cookie dough buns!");
	}

	@Override
	public void cook() {
		System.out.println("Cooking Jamaican Style...");
	}

}
