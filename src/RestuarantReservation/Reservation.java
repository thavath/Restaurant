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
		
	}

	public ArrayList<Booking> read() {
		
		return null;
	}

	public void update(Booking b) {
		
	}

	public void delete(Booking b) {
		
	}

	public String toString() {
		return " Reservation [ reservationList = " + reservationList + " ] ";
	}	
}
