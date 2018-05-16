package RestuarantReservation;

public class Food {
	
	private int ID;
	private String name;
	private double price;
	
	public Food(int ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return " Food [ ID = " + ID + ", name = " + name + ", price = " + price + "]";
	}
	
}
