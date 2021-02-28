package az.maqa.java.designpatterns.decorator.model;

import az.maqa.java.designpatterns.decorator.controller.IceCream;

public class BasicIceCream implements IceCream {

	public BasicIceCream() {
		System.out.println("Creating a basic ice cream");
	}
	
	@Override
	public double cost() {
		return 0.5;
	}

}
