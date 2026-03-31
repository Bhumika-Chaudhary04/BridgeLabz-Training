package class_and_object;
public class Item {
    private String itemCode;
    private String itemName;
    private double price;
    //constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    // Method to display item details
    public void displayDetails() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }
}

// Main class to test Item objects
class DisplayItemDetails {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("01AA", "Water bottle", 500.0);
        Item item2 = new Item("01BB", "Rice", 700.0);
        Item item3 = new Item("02AA", "blackboard", 400.0);
        // Displaying item details
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();
        // Example: calculating total cost
        int quantity = 2;
        System.out.println("Total cost of Water bottle for quantity "+ quantity + " : " + item1.calculateTotalCost(quantity));
    }
}
