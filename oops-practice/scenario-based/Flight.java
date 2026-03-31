package FlightBookingSystem;

//Represents available flight details
public class Flight {

	int flightId;
	String source;
	String destination;
	double price;

	public Flight(int flightId, String source, String destination, double price) {
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

	void displayFlight() {
		System.out.println(
				"Flight ID: " + flightId + ", From: " + source + ", To: " + destination + ", Price: ₹" + price);
	}
}
