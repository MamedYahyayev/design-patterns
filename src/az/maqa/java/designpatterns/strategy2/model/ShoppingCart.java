package az.maqa.java.designpatterns.strategy2.model;

import java.util.ArrayList;
import java.util.List;

import az.maqa.java.designpatterns.strategy2.controller.Payment;

public class ShoppingCart {

	List<Product> products = new ArrayList<Product>();

	public ShoppingCart() {

	}

	public void addProduct(Product product) {
		products.add(product);
		System.out.println(product + " added.");
	}

	public void removeProduct(Product product) {
		products.remove(product);
		System.out.println(product + " removed.");
	}

	public float calculateTotal() {
		float sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}

	public void pay(Payment payment) {
		payment.pay(calculateTotal());
	}

}
