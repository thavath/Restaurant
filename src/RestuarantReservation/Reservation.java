package RestuarantReservation;

import java.util.List;
import java.util.Scanner;

public class Reservation implements CRUD<Booking>{
	
	private List<Booking> reservationList;
	
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

	public List<Booking> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Booking b) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Booking b) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return " Reservation [ reservationList = " + reservationList + " ] ";
	}
	
	

}
