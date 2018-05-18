package RestuarantReservation;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements CRUD<Booking>{
	
	private List<Booking> reservationList = new ArrayList<Booking>();
	
	public List<Booking> getReservationList() {
		return reservationList;
	}
	
	

	public void setReservationList(List<Booking> reservationList) {
		this.reservationList = reservationList;
	}

	public Reservation(List<Booking> reservationList) {
		this.reservationList = reservationList;
	}

	public void create(Booking b) {
		b = new Booking();
		b.reservedBooking();
	}

	public ArrayList<Booking> read() {
		Booking b = new Booking();
		System.out.println(b.toString());
		for (int i = 0; i < b.getReservedTable().size(); i++) {
			System.out.println(" #"+b.getReservedTable().get(i).getReserveTable());
		}
		return null;
	}

	public void update(Booking b) {
		for (int i = 0; i < b.getReservedTable().size(); i++) {
			System.out.println(" #"+b.getReservedTable().get(i).getReserveTable());
		}
	}

	public void delete(Booking b) {
		b = null;
	}

	public String toString() {
		return " Reservation [ reservationList = " + reservationList + " ] ";
	}	
}
