package VehicleRentalApplication;

//Abstract parent class
public abstract class Vehicle implements IRentable {

	protected int vehicleId;
	protected String brand;
	protected double rentPerDay;

	public Vehicle(int vehicleId, String brand, double rentPerDay) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	// Polymorphic method
	public abstract void displayInfo();
}
