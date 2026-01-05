package oops_pillars;
import java.util.ArrayList;
import java.util.List;
//interface for GPS
interface GPS {
    String getCurrentLocation(); //get current location
    void updateLocation(String location); //update location
}
//abstract base class for vehicle
abstract class Vehicle {
    private String vehicleId; //vehicle id
    private String driverName; //driver name
    protected double ratePerKm; //rate per km
    private String location="Unknown"; //current location
    public Vehicle(String vehicleId,String driverName,double ratePerKm){ this.vehicleId=vehicleId;this.driverName=driverName;this.ratePerKm=ratePerKm; }
    public abstract double calculateFare(double distance); //abstract fare
    public void getVehicleDetails(){ System.out.println("Vehicle ID: "+vehicleId+"\nDriver: "+driverName+"\nRate/km: "+ratePerKm); } //details
    public String getVehicleId(){ return vehicleId; } //get id
    public String getDriverName(){ return driverName; } //get driver
    public String getLocation(){ return location; } //get location
    public void setLocation(String loc){ location=loc; } //set location
}
//car class implementing GPS
class Car extends Vehicle implements GPS {
    public Car(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return distance*ratePerKm; } //calculate fare
    @Override
    public String getCurrentLocation(){ return getLocation(); } //current location
    @Override
    public void updateLocation(String location){ setLocation(location); } //update location
}
//bike class implementing GPS
class Bike extends Vehicle implements GPS {
    public Bike(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return distance*ratePerKm*0.9; } //slightly cheaper
    @Override
    public String getCurrentLocation(){ return getLocation(); }
    @Override
    public void updateLocation(String location){ setLocation(location); }
}
//auto class implementing GPS
class Auto extends Vehicle implements GPS {
    public Auto(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double distance){ return distance*ratePerKm*0.8; } //cheaper fare
    @Override
    public String getCurrentLocation(){ return getLocation(); }
    @Override
    public void updateLocation(String location){ setLocation(location); }
}
//main class
public class RideHailingApplication {
    public static void main(String[] args){
        List<Vehicle> rides=new ArrayList<>();
        Car car=new Car("CAR001","Alice",15); car.updateLocation("Downtown"); //create car
        Bike bike=new Bike("BIKE001","Bob",10); bike.updateLocation("Uptown"); //create bike
        Auto auto=new Auto("AUTO001","Charlie",8); auto.updateLocation("Station"); //create auto
        rides.add(car); rides.add(bike); rides.add(auto); //add rides
        calculateFares(rides,12); //calculate fares for 12 km
    }
    public static void calculateFares(List<Vehicle> rides,double distance){
        for(Vehicle v:rides){
            v.getVehicleDetails(); //display details
            System.out.println("Current Location: "+((v instanceof GPS)?((GPS)v).getCurrentLocation():"Unknown")); //location
            double fare=v.calculateFare(distance); //calculate fare
            System.out.println("Fare for "+distance+"\nkm: "+fare); //fare
            System.out.println("------------------------------"); //separator
        }
    }
}
