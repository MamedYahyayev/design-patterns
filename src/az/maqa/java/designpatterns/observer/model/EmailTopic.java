package az.maqa.java.designpatterns.observer.model;

import java.util.ArrayList;
import java.util.List;

import az.maqa.java.designpatterns.observer.controller.Observer;
import az.maqa.java.designpatterns.observer.controller.Subject;

public class EmailTopic implements Subject {

	private List<Observer> observers;
	private String message;

	public EmailTopic() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if (observer == null)
			throw new NullPointerException("Observer is null");

		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void unRegister(Observer observer) {
		boolean isExists = isObserverExists(observer);
		if (isExists) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	public void postMessage(String message) {
		this.message = message;
		System.out.println("Message posted to my topic: " + message);
		notifyObservers();
	}

	private boolean isObserverExists(Observer observer) {
		if (observer == null) {
			throw new NullPointerException("Observer is null!!!");
		}
		return observers.contains(observer);
	}

}
