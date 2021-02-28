package az.maqa.java.designpatterns.factory.model;

public class MozambicanCheeseBurger extends Hamburger {

	public MozambicanCheeseBurger() {
		super.setName("Mozambican Cheese Burger");
		super.setSauce("Spicy Mozambican Sauce");
		super.setBuns("Cookie dough buns!");
	}

	@Override
	public void cook() {
		System.out.println("Cooking Mozambican Style...");
	}

}
