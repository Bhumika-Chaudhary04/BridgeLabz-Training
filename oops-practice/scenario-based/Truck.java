package VehicleRentalApplication;

public class Truck extends Vehicle {

	public Truck(int vehicleId, String brand, double rentPerDay) {
		super(vehicleId, brand, rentPerDay);
	}

	@Override
	public double calculateRent(int days) {
		return (rentPerDay * days) + 1000; // heavy vehicle charge
	}

	@Override
	public void displayInfo() {
		System.out.println("Truck | ID: " + vehicleId + ", Brand: " + brand + ", Rent/Day: " + rentPerDay);
	}
}
