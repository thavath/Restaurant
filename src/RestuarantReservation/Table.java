package RestuarantReservation;

import java.util.Scanner;

public class Table {
	
	private int numSeats;
	private String ID;
	private boolean available;
	private int reserveTable;
	Scanner input = new Scanner(System.in);
	
	public Table(int numSeats, String ID, boolean available) {
		this.numSeats = numSeats;
		this.ID = ID;
		this.available = available;
	}

	public Table() {
		numSeats = 0;
		ID = "Null";
		available = true;
	}

	public boolean getOccupied() {
		return available;
	}

	public void setOccupied(boolean busy) {
		this.available = busy;
	}
	
public void createTable() {
		
		Scanner input = new Scanner(System.in);
		try {
			do {
				System.out.print("Enter your table No:  ");
				ID = input.nextLine();
				System.out.print("Enter number of seats:  ");
				
				
				while (!input.hasNextInt()) {
		            System.out.print("You must enter a valid number! Try again: ");
		            input.next();
			    }
				numSeats = input.nextInt();
				
				System.out.println("Do you want to take more reservation?[Y/N]");
				input.nextLine().trim();
			 } while (input.nextLine().equalsIgnoreCase("y"));
		}finally {
	          input.close();
	    }		
	}
	public String toString() {
		if(available!=false) {
			return "Table#'"+ID+"'\t\tSeats: '"+numSeats+"'\t\tStatus: 'Free'";
		}else {
			return "Table#'"+ID+"'\t\tSeats: '"+numSeats+"'\t\tStatus: 'Busy'";
		}
	}
	public int getReserveTable() {
		return reserveTable;
	}

	public void setReserveTable(int reserveTable) {
		this.reserveTable = reserveTable;
	}
}
