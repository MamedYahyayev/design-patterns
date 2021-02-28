package az.maqa.java.designpatterns.strategy2.main;

import az.maqa.java.designpatterns.strategy2.model.PaypalAlgorithm;
import az.maqa.java.designpatterns.strategy2.model.Product;
import az.maqa.java.designpatterns.strategy2.model.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product((float) 20, "UPCSAD12341");
		Product product2 = new Product((float) 23, "UPCFRTY567Z");

		// add product to cart
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct(product1);
		cart.addProduct(product2);

		// remove product from cart
		cart.removeProduct(product1);

		// pay
		cart.pay(new PaypalAlgorithm());

	}

}
