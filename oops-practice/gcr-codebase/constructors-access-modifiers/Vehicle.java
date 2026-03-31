package constructors_access_modifiers;
public class Vehicle {
    //instance variables
    private String ownerName;
    private String vehicleType;
    //class variable (shared by all vehicles)
    private static double registrationFee = 2000.0;
    //constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    //instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println("------------------------------------");
    }
    //class method (static method)
    public static void updateRegistrationFee(double newFee) {
        registrationFee=newFee;
    }
    //main method for testing
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Bhumika Chaudhary","Car");
        Vehicle v2=new Vehicle("Prachi Chaudhary","Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        //updating registration fee
        Vehicle.updateRegistrationFee(1000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
