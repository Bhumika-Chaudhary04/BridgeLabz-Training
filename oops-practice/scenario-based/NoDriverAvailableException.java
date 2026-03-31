package CabBookingManagementSystem;
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}