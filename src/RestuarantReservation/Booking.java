package RestuarantReservation;

import java.util.List;
import java.util.Scanner;

public class Booking {
	private int ID;
	private List<Table> reservedTable;
	private String customerName;
	private String customerNo;
	
	public Booking(int ID, List<Table> reservedTable, String customerName, String customerNo) {
		this.ID = ID;
		this.reservedTable = reservedTable;
		this.customerName = customerName;
		this.customerNo = customerNo;
	}
	
	public List<Table> getReservedTable() {
		return reservedTable;
	}
	
	public void setReservedTable(List<Table> reservedTable) {
		this.reservedTable = reservedTable;
	}
	
	public void reservedBooking() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Booking Id :");
		ID = input.nextInt();
		System.out.println("Enter Customer Name :");
		customerName = input.next();
		System.out.println("Enter Customer No :");
		customerNo = input.nextLine();
		Table t = new Table();
		t.createTable();
	}
	
	public String toString() {
		return "Booking [ ID= " + ID + ", reservedTable = " + reservedTable + ", customerName = " + customerName
				+ ", customerNo = " + customerNo + "]";
	}	
}
