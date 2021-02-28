package az.maqa.java.designpatterns.observer.controller;

public interface Subject {

	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void notifyObservers();

	public Object getUpdate(Observer observer);

}
