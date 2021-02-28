package az.maqa.java.designpatterns.factory.model;

public class MozambicanVeggieBurger extends Hamburger {

	public MozambicanVeggieBurger() {
		super.setName("Mozambican Veggie Burger");
		super.setSauce("Spicy Mozambican Sauce");
		super.setBuns("Cookie dough buns!");
	}

	@Override
	public void cook() {
		System.out.println("Cooking Mozambican Style...");
	}
}
