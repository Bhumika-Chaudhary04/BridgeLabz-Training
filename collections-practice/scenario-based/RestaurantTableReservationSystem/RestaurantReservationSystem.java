package RestaurantTableReservationSystem;
import java.util.*;
public class RestaurantReservationSystem {
	Map<Integer,Table> tables=new HashMap<>();
	List<Reservation> reservations=new ArrayList<>();
	public void addTable(Table t) {
		tables.put(t.getTableNumber(),t);
	}
	//reserve table
	public void reserveTable(int tableNumber,String timeSlot,String customerName) throws TableAlreadyReservedException{
		for(Reservation r : reservations) {
			if(r.getTableNumber()==tableNumber && r.getTimeSlot().equals(timeSlot)) {
				throw new TableAlreadyReservedException("Table : " + tableNumber + " already reserved for " + timeSlot);
			}
		}
		reservations.add(new Reservation(tableNumber,timeSlot,customerName));
		System.out.println("Reservation successfull!");
	}
	//cancel Reservation
	public void cancelReservation(int tableNumber,String timeSlot) {
		for(int i=0;i<reservations.size();i++) {
			if(reservations.get(i).getTableNumber()==tableNumber && reservations.get(i).getTimeSlot().equals(timeSlot)) {
				reservations.remove(i);
				System.out.println("Reservation cancelled");
				return;
			}
		}
		System.out.println("No reservation found");
	}
	//show Available Tables
	public void showAvailableTables(String timeSlot) {
		System.out.println("Available tables for " + timeSlot + ":");
		for(Table t : tables.values()) {
			boolean reserved=false;
			for(Reservation r:reservations) {
				if(r.getTableNumber()==t.getTableNumber() && r.getTimeSlot().equals(timeSlot)) {
					reserved=true;
					break;
				}
			}
			if(!reserved) {
				System.out.println(t);
			}
		}
	}
}
