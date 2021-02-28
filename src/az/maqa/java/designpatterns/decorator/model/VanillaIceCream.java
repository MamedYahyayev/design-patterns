package az.maqa.java.designpatterns.decorator.model;

import az.maqa.java.designpatterns.decorator.controller.IceCream;
import az.maqa.java.designpatterns.decorator.controller.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		return 2.0 + super.cost();
	}

}
