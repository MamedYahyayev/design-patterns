package az.maqa.java.designpatterns.decorator.model;

import az.maqa.java.designpatterns.decorator.controller.IceCream;
import az.maqa.java.designpatterns.decorator.controller.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		return 1.0 + super.cost();
	}

}
