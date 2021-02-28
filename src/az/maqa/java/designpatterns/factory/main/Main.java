package az.maqa.java.designpatterns.factory.main;

import az.maqa.java.designpatterns.factory.controller.HamburgerStore;
import az.maqa.java.designpatterns.factory.model.HamburgerType;
import az.maqa.java.designpatterns.factory.model.JamHamburgerStore;

public class Main {

	public static void main(String[] args) {
		HamburgerStore jHamburgerStore = new JamHamburgerStore();
		jHamburgerStore.orderHamburger(HamburgerType.VEGGIE);
	}

}
