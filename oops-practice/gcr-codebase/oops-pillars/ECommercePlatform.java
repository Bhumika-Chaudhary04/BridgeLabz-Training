package oops_pillars;
import java.util.*;
//interface for taxable products
interface Taxable {
    double calculateTax(); // calculates tax amount
    String getTaxDetails(); // returns tax description
}
//abstract base class for all products
abstract class Product {
    private int productId; // product id
    private String name; // product name
    protected double price; // product price
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount(); //discount logic
    public int getProductId() {
        return productId; //return id
    }
    public String getName() {
        return name; //return name
    }
    public double getPrice() {
        return price; //return price
    }
    public void setPrice(double price) {
        if (price > 0) this.price = price; //update price safely
    }
    public void displayBasicDetails() {
        System.out.println("Product ID : " + productId); //print id    
        System.out.println("Name       : " + name); //print name
        System.out.println("Base Price : " + price); //print price
    }
}
// Electronics product with tax
class Electronics extends Product implements Taxable {
    public Electronics(int id,String name,double price) {
        super(id,name,price); //call parent constructor
    }
    public double calculateDiscount() {
        return price*0.10; //10% discount
    }
    public double calculateTax() {
        return price*0.18; //18% GST
    }
    public String getTaxDetails() {
        return "18% GST on Electronics";//tax info
    }
}
// Clothing product with tax
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price); //call parent constructor
    }
    public double calculateDiscount() {
        return price * 0.20; //20% discount
    }
    public double calculateTax() {
        return price * 0.05; //5% GST
    }
    public String getTaxDetails() {
        return "5% GST on Clothing"; //tax info
    }
}
//grocery product without tax
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price); // call parent constructor
    }
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}

//main class
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); // product list
        products.add(new Electronics(101, "Laptop", 60000)); // add electronics
        products.add(new Clothing(102, "Jacket", 3000)); // add clothing
        products.add(new Groceries(103, "Rice Bag", 1200)); // add groceries
        calculateFinalPrices(products); // calculate final prices
    }

    public static void calculateFinalPrices(List<Product> products) {
        for (Product p : products) {
            p.displayBasicDetails(); // show product details
            double tax = 0; // initialize tax
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p; // type casting
                tax = t.calculateTax(); // calculate tax
                System.out.println("Tax Info   : " + t.getTaxDetails()); // print tax info
            }
            double discount = p.calculateDiscount(); // calculate discount
            double finalPrice = p.getPrice() + tax - discount; // final price formula
            System.out.println("Discount   : " + discount); // print discount
            System.out.println("Final Price: " + finalPrice); // print final price
            System.out.println("------------------------------"); // separator
        }
    }
}
