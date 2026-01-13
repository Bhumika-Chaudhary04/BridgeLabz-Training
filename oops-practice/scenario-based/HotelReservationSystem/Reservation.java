package HotelReservationSystem;

public class Reservation {
	private Guest guest;
	private Room room;
	private int days;
	private PricingStrategy pricing;

	public Reservation(Guest guest, Room room, int days, PricingStrategy pricing) throws RoomNotAvailableException {
		this.guest = guest;
		this.room = room;
		this.days = days;
		this.pricing = pricing;
		room.bookRoom();
	}

	public double generateBill() {
		return pricing.calculatePrice(room.getPrice(), days);
	}

	public void checkout() {
		room.checkout();
	}
}
