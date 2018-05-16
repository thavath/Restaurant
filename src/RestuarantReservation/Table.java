package RestuarantReservation;

import java.util.Scanner;

public class Table {
	
	private int numSeats;
	private String ID;
	private boolean available;
	private int reservedSeats;
	private String tableID;
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
	
	public int getReservedSeats() {
		return reservedSeats;
	}

	public void setReservedSeats(int reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
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
			System.out.println("Table#"+ID+"\t\tSeats: "+numSeats+"\t\tStatus: 'Free'");
		}else {
			System.out.println("Table#"+ID+"\t\tSeats: "+numSeats+"\t\tStatus: 'Busy'");
		}
	}
	public void reservedTable() {
		System.out.println("How many tables do you want to book? :");
		setReservedSeats(input.nextInt());
		for (int i = 0; i < getReservedSeats(); i++) {
			System.out.println("Enter table number you want to reserve :");
		}
	}
	public String toString() {
		return " Table [ numSeats = " + numSeats + ", ID = " + ID + ", available = " + available + "]";
	}
	
}
