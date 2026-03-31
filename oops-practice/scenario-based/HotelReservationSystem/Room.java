package HotelReservationSystem;

public class Room {
	protected int roomNumber;
	protected double price;
	protected boolean isAvailable;

	public Room(int roomNumber, double price) {
		this.roomNumber = roomNumber;
		this.price = price;
		this.isAvailable = true;
	}

	public void bookRoom() throws RoomNotAvailableException {
		if (!isAvailable)
			throw new RoomNotAvailableException("Room not available");
		isAvailable = false;
	}

	public void checkout() {
		isAvailable = true;
	}

	public double getPrice() {
		return price;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
}
