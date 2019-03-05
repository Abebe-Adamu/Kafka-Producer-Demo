package model;

public class User {
	private String menu;
	private String lunch;
	private double price;
	public User(String menu, String lunch, double price) {
		super();
		this.menu = menu;
		this.lunch = lunch;
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
