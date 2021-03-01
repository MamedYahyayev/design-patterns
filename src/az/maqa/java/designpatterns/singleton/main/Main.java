package az.maqa.java.designpatterns.singleton.main;


import az.maqa.java.designpatterns.singleton.model.SingletonClass;

public class Main {

	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();

		singleton.setName("Samir");
		singleton.setType("singleton");

		System.out.println("Singleton object: " + singleton);

		SingletonClass singleton1 = SingletonClass.getInstance();

		System.out.println("Singleton 1 object: " + singleton1);

		System.out.println(singleton1 == singleton);
		System.out.println(singleton.equals(singleton1));

	}

}
