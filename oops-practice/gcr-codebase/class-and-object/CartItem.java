package class_and_object;
public class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Method to add items to the cart
    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }
    // Method to remove items from the cart
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }
    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
}
// Main class to test Shopping Cart
class DisplayShoppingCart {
    public static void main(String[] args) {
        // Creating CartItem object
        CartItem item = new CartItem("Laptop", 999.99, 1);
        // Display initial item details
        item.displayItemDetails();
        // Add items
        item.addItem(2);
        // Remove items
        item.removeItem(1);
        // Display total cost
        item.displayTotalCost();
    }
}
