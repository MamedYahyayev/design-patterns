package az.maqa.java.designpatterns.factory.model;

import az.maqa.java.designpatterns.factory.controller.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {

	@Override
	public Hamburger createHamburger(HamburgerType hamburgerType) {
		if (hamburgerType.getType().equals("cheese"))
			return new MozambicanCheeseBurger();
		else if (hamburgerType.getType().equals("veggie"))
			return new MozambicanVeggieBurger();

		return null;
	}

}
