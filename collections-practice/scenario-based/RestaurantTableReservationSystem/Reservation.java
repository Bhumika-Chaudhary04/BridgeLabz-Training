package RestaurantTableReservationSystem;

public class Reservation {
	private int tableNumber;
	private String timeSlot;
	private String customerName;
	//constructor
	public Reservation(int tableNumber,String timeSlot,String customerName) {
		this.tableNumber=tableNumber;
		this.timeSlot=timeSlot;
		this.customerName=customerName;
	}
	//getter methods
	public int getTableNumber() {
		return tableNumber;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public String toString() {
		return "Table " + tableNumber +" reserved by " + customerName +" at " + timeSlot;
	}
}
