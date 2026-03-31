package oops_pillars;
import java.util.*;
//interface for insurable vehicles
interface Insurable {
    double calculateInsurance(); 
    String getInsuranceDetails();
}
//abstract base class for all vehicles
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate; 
    private String insurancePolicyNumber;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    //encapsulation: getters and setters
    public String getVehicleNumber() {
        return vehicleNumber; //get vehicle number
    }
    public String getType() {
        return type; //get type
    }
    public double getRentalRate() {
        return rentalRate; //get rental rate
    }
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber; //set insurance number
    }
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber; //get insurance number
    }
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber); //print vehicle number
        System.out.println("Type          : " + type); //print type
        System.out.println("Rental Rate   : " + rentalRate); //print rental rate
    }
}
//car class implementing insurance
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate); //initialize car
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days; //rental cost formula
    }
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15; //15% of rate as insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Car insurance: 15% of daily rate"; //insurance info
    }
}
//bike class implementing insurance
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate); //initialize bike
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days; //rental cost formula
    }
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10; //10% of rate as insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: 10% of daily rate"; //insurance info
    }
}
//truck class implementing insurance
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate); //initialize truck
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2; //trucks have extra charges
    }
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.20; //20% of rate as insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: 20% of daily rate"; //insurance info
    }
}
//main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>(); //list of vehicles
        Car car1 = new Car("CAR123", 2000); 
        car1.setInsurancePolicyNumber("CAR-INS-001"); 
        Bike bike1 = new Bike("BIKE456", 500);
        bike1.setInsurancePolicyNumber("BIKE-INS-002");
        Truck truck1 = new Truck("TRK789", 4000);
        truck1.setInsurancePolicyNumber("TRK-INS-003");
        vehicles.add(car1); 
        vehicles.add(bike1);
        vehicles.add(truck1);
        calculateCosts(vehicles, 5);
    }
    public static void calculateCosts(List<Vehicle> vehicles, int days) {
        for (Vehicle v : vehicles) {
            v.displayDetails(); //show vehicle info
            double rentalCost = v.calculateRentalCost(days); //rental cost
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v; //type casting
                double insurance = ins.calculateInsurance(); //insurance
                System.out.println("Insurance Info: " + ins.getInsuranceDetails()); //print info
                System.out.println("Insurance Cost: " + insurance); //print cost
            }
            System.out.println("Rental Cost for " + days + " days: " + rentalCost); //print rental
            System.out.println("Total Cost: " + (rentalCost + ((v instanceof Insurable) ? ((Insurable)v).calculateInsurance() : 0))); //total cost
            System.out.println("------------------------------"); //separator
        }
    }
}
