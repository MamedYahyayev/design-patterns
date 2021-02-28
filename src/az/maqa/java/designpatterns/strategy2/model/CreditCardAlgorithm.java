package az.maqa.java.designpatterns.strategy2.model;

import az.maqa.java.designpatterns.strategy2.controller.Payment;

public class CreditCardAlgorithm implements Payment {

	private String name;
	private String cardNumber;

	public CreditCardAlgorithm() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	@Override
	public void pay(float amount) {
		System.out.println("$" + amount + " paid.");
	}

}
