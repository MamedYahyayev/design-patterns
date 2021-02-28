package az.maqa.java.designpatterns.factory.controller;

import az.maqa.java.designpatterns.factory.model.Hamburger;
import az.maqa.java.designpatterns.factory.model.HamburgerType;

public abstract class HamburgerStore {

	public Hamburger orderHamburger(HamburgerType type) {
		if (type == null || type.getType().isEmpty())
			throw new NullPointerException("You must to add type of hamburger!!!");

		Hamburger burger = createHamburger(type);

		burger.prepare();
		burger.cook();
		burger.box();

		return burger;
	}

	public abstract Hamburger createHamburger(HamburgerType type);
}
