package RestaurantTableReservationSystem;

public class Table {
	private int tableNumber;
	private int capacity;
    //constructor
	public Table(int tableNumber,int capacity){
		this.tableNumber=tableNumber;
		this.capacity=capacity;
	}
	//getter methods
	public int getTableNumber() {
		return tableNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	@Override
	public String toString() {
		return "Table Number : "+tableNumber +" has capacity : "+capacity;
	}
}
