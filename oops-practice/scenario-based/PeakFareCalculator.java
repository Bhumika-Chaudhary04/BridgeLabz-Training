package CabBookingManagementSystem;
public class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15; // ₹15 per km
    }
}