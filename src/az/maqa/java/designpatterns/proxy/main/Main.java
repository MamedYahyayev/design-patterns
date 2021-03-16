package az.maqa.java.designpatterns.proxy.main;

import az.maqa.java.designpatterns.proxy.model.Bank;
import az.maqa.java.designpatterns.proxy.model.ProxyBank;

public class Main {

	public static void main(String[] args) {
		Bank bank = new ProxyBank();

		try {
			bank.withDrawMoney("Qasim");
			bank.withDrawMoney("Samir");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
