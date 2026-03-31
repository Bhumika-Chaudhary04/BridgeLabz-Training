package class_and_object;
// MovieTicket class represents a movie ticket
public class MovieTicket {
    // Private fields (Encapsulation)
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    // Constructor
    public MovieTicket() {
        this.isBooked = false;
    }
    // Method to book ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }
    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Price: $" + price);
            System.out.println();
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
    }
}
// Main class to test MovieTicket system
class DisplayMovieTicket {
    public static void main(String[] args) {
        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket();
        // Display ticket status before booking
        ticket.displayTicketDetails();
        // Booking ticket
        ticket.bookTicket("Dragon", "A10", 120.0);
        // Trying to book again
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
        // Display ticket details
        ticket.displayTicketDetails();
    }
}
