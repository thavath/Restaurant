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
		
		System.out.println("Enter your table No: ");
		ID = input.next();
		System.out.println("Enter number of seats: ");
		numSeats = input.nextInt();
	
	}
	public void showTable() {
		if(available!=false) {
			System.out.println("Table#'"+ID+"'\t\tSeats: '"+numSeats+"'\t\tStatus: 'Free'");
		}else {
			System.out.println("Table#'"+ID+"'\t\tSeats: '"+numSeats+"'\t\tStatus: 'Busy'");
		}
	}
	public int getReserveTable() {
		return reserveTable;
	}

	public void setReserveTable(int reserveTable) {
		this.reserveTable = reserveTable;
	}
}
