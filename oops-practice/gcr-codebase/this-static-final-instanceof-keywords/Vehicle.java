package this_static_final_instanceof_keywords;
public class Vehicle {
    //static variable
    private static double registrationFee = 150.0;
    //final variable
    private final String registrationNumber;
    //instance variables
    private String ownerName;
    private String vehicleType;
    //constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    //display details using instanceof
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
    //main method
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}