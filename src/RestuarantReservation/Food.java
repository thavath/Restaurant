package RestuarantReservation;

import java.util.Scanner;

public class Food {
	
	private String ID;
	private String name;
	private double price;
	
	public Food() {
		ID = "unknow";
		name = "unknow";
		price = 0.0;
	}
	public Food(String ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
	}
	
	public void createFood(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your food code: ");
		ID = input.next();
		System.out.println("Enter your food name: ");
		name = input.next();
		System.out.println("Enter your food price: ");
		price = input.nextDouble();
	}
	public void showFood(){
		System.out.println("'"+ID+"'\t\t'"+name+"'\t\t'"+price+"'");
	}
	public String toString() {
		return " Food [ ID = " + ID + ", name = " + name + ", price = " + price + "]";
	}
	
}
