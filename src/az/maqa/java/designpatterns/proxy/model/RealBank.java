package az.maqa.java.designpatterns.proxy.model;

public class RealBank implements Bank {

	@Override
	public void withDrawMoney(String clientName) throws Exception {
		System.out.println(clientName + " is Withdrawing from ATM...");
	}

}
