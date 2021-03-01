package az.maqa.java.designpatterns.singleton.model;

public class SingletonClass {

	private volatile static SingletonClass uniqueInstance;

	private String name;
	private String type;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonClass.class) {
				if (uniqueInstance == null)
					uniqueInstance = new SingletonClass();
			}
		}
		return uniqueInstance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SingletonClass [name=" + name + ", type=" + type + "]";
	}

}
