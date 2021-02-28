package az.maqa.java.designpatterns.factory.model;

public abstract class Hamburger {
	private String name;
	private String sauce;
	private String buns;

	public void prepare() {
		System.out.println("Burger preparing..." + name);
		System.out.println("Adding sauce..." + sauce);
		System.out.println("Adding buns..." + buns);
	}

	public void cook() {
		System.out.println("Burger cooking...");
	}

	public void box() {
		System.out.println("Burger boxing...");
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
	 * @return the sauce
	 */
	public String getSauce() {
		return sauce;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * @return the buns
	 */
	public String getBuns() {
		return buns;
	}

	/**
	 * @param buns the buns to set
	 */
	public void setBuns(String buns) {
		this.buns = buns;
	}

}
