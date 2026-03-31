package constructors_access_modifiers;
public class Product {
	private String productName;
	private double price;
	private static int totalProducts;
	//constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment whenever a product is created
    }
	//instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("----------------------------");
    }
    //class method (static method)
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
   //main method for testing
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile Phone", 25000);
        Product p3 = new Product("Headphones", 3000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        Product.displayTotalProducts();
    }

}
