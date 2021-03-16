package az.maqa.java.designpatterns.proxy.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

	private RealBank bank = new RealBank();
	private static List<String> bannedClients;

	static {
		bannedClients = new ArrayList<String>();
		bannedClients.add("Samir");
	}

	@Override
	public void withDrawMoney(String clientName) throws Exception {
		if (bannedClients.contains(clientName)) {
			throw new Exception("Access Denied! for " + clientName + " You are not user.");
		}
		bank.withDrawMoney(clientName);
	}

}
