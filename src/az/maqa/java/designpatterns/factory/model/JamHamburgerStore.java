package az.maqa.java.designpatterns.factory.model;

import az.maqa.java.designpatterns.factory.controller.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {

	@Override
	public Hamburger createHamburger(HamburgerType hamburgerType) {
		if (hamburgerType.getType().equals("cheese"))
			return new JamaicanCheeseBurger();
		else if (hamburgerType.getType().equals("veggie"))
			return new JamaicanVeggieBurger();

		return null;
	}

}
