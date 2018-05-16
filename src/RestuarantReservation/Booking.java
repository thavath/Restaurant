package RestuarantReservation;

import java.util.List;

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
	
	public String toString() {
		return "Booking [ ID= " + ID + ", reservedTable = " + reservedTable + ", customerName = " + customerName
				+ ", customerNo = " + customerNo + "]";
	}
	
}
