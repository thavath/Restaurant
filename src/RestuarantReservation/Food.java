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
		try {
			do {
				System.out.print("Enter your food code:  ");
				ID = input.nextLine();
				System.out.print("Enter your food name:  ");
				name = input.nextLine();
				System.out.print("Enter your food price:  ");
			    while (!input.hasNextDouble()) {
		              System.out.print("You must enter a valid number! Try again: ");
		              input.next();
		        }
				price = input.nextDouble();
				System.out.print("Do you want to add more food ?[Y/N]:   ");
			    input.nextLine();
			} while (input.nextLine().equalsIgnoreCase("y"));
			
			
		}finally {
		          input.close();
		}		
	}
	
	public String toString() {
		return " Food [ '"+ID+"'\t\t'"+name+"'\t\t'"+price+"']";
	}
}
