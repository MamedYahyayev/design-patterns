package az.maqa.java.designpatterns.decorator.main;

import az.maqa.java.designpatterns.decorator.controller.IceCream;
import az.maqa.java.designpatterns.decorator.model.BasicIceCream;
import az.maqa.java.designpatterns.decorator.model.ChocolateIceCream;
import az.maqa.java.designpatterns.decorator.model.MintIceCream;
import az.maqa.java.designpatterns.decorator.model.VanillaIceCream;

public class Main {

	public static void main(String[] args) {
		IceCream basicIceCream = new BasicIceCream();
		System.out.println("Basic ice cream cost is $" + basicIceCream.cost());

		// vanilla iceCream
		IceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
		System.out.println("Vanilla ice cream cost is $" + vanillaIceCream.cost());

		// chocolate ice cream
		IceCream chocolateIceCream = new ChocolateIceCream(vanillaIceCream);
		System.out.println("Chocolate ice cream cost is $" + chocolateIceCream.cost());

		IceCream mintIceCream = new MintIceCream(chocolateIceCream);
		System.out.println("Mint ice cream cost is $" + mintIceCream.cost());

	}

}
