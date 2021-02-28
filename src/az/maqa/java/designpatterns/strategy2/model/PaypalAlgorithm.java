package az.maqa.java.designpatterns.strategy2.model;

import az.maqa.java.designpatterns.strategy2.controller.Payment;

public class PaypalAlgorithm implements Payment {

	private String email;
	private String password;

	public PaypalAlgorithm() {

	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	@Override
	public void pay(float amount) {
		System.out.println("$" + amount + " paid.");
	}

}
