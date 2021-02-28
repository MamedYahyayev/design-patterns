package az.maqa.java.designpatterns.decorator.model;

import az.maqa.java.designpatterns.decorator.controller.IceCream;
import az.maqa.java.designpatterns.decorator.controller.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		return 3.0 + super.cost();
	}

}
