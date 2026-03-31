package scenario_based;
import java.util.Scanner;
// Custom Exception
class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}
public class InvoiceGeneratorWithExceptionHandling {
    // Parse invoice input and return task details
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInvoiceFormatException("Invoice input cannot be empty");
        }
        // Split by comma to get individual tasks
        String[] tasks = input.split(",");
        for (String task : tasks) {
            // Each task must contain '-' and amount
            if (!task.contains("-")) {
                throw new InvalidInvoiceFormatException(
                        "Invalid format. Missing '-' in task: " + task.trim());
            }
            String[] parts = task.split("-");
            if (parts.length != 2) {
                throw new InvalidInvoiceFormatException(
                        "Invalid format in task: " + task.trim());
            }
            // Extract amount part
            String amountPart = parts[1].trim();
            // Amount must contain a number
            String numberOnly = amountPart.replaceAll("[^0-9]", "");
            if (numberOnly.isEmpty()) {
                throw new InvalidInvoiceFormatException(
                        "Amount missing in task: " + task.trim());
            }
        }
        return tasks;
    }
    // Calculate total invoice amount
    public static int getTotalAmount(String[] tasks) {
        int total = 0;
        for (String task : tasks) {
            String[] parts = task.split("-");
            String amountPart = parts[1].trim();
            // Extract numeric value
            int amount = Integer.parseInt(amountPart.replaceAll("[^0-9]", ""));
            total += amount;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invoice details:");
        System.out.println("Example: Logo Design - 3000 INR, Web Page - 4500 INR");

        String input = sc.nextLine();

        try {
            String[] tasks = parseInvoice(input);

            System.out.println("Invoice Details:");
            for (String task : tasks) {
                System.out.println(task.trim());
            }

            System.out.println("Total Invoice Amount: "
                    + getTotalAmount(tasks) + " INR");

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
