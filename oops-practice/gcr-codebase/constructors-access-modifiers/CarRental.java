package constructors_access_modifiers;
public class CarRental {
    // attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay;
    private int totalCost;
    // default constructor
    CarRental() {
        customerName = "Default Customer";
        carModel = "Swift";
        rentalDays = 1;
        costPerDay = 1500;
        calculateTotalCost();
    }
    // parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 2000; // per day rent
        calculateTotalCost();
    }
    // method to calculate total cost
    void calculateTotalCost() {
        totalCost=rentalDays*costPerDay;
    }
    // display method
    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + totalCost);
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Bhumika Chaudhary", "Creta", 5);
        cr1.display();
        cr2.display();
    }
}
