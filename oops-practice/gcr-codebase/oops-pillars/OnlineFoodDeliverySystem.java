package oops_pillars;
import java.util.ArrayList;
import java.util.List;

//interface for discountable items
interface Discountable {
    double applyDiscount(); //apply discount
    String getDiscountDetails(); //discount info
}
//abstract base class for food items
abstract class FoodItem {
    private String itemName; //item name
    protected double price; //item price
    protected int quantity; //item quantity
    public FoodItem(String itemName,double price,int quantity) { this.itemName=itemName;this.price=price;this.quantity=quantity; }
    public abstract double calculateTotalPrice(); //abstract total price
    public void getItemDetails() { System.out.println("Item: "+itemName+"\nPrice: "+price+"\nQuantity: "+quantity); } //display details
    public String getItemName(){ return itemName; } //get name
    public double getPrice(){ return price; } //get price
    public int getQuantity(){ return quantity; } //get quantity
    public void setQuantity(int quantity){ if(quantity>0)this.quantity=quantity; } //set quantity
}
//veg item
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return price*quantity; } //veg total
    @Override
    public double applyDiscount(){ return calculateTotalPrice()*0.10; } //10% discount
    @Override
    public String getDiscountDetails(){ return "10% discount on veg item"; } //discount info
}
//non-veg item
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return (price+50)*quantity; } //additional charge
    @Override
    public double applyDiscount(){ return calculateTotalPrice()*0.05; } //5% discount
    @Override
    public String getDiscountDetails(){ return "5% discount on non-veg item"; } //discount info
}
//main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args){
        List<FoodItem> order=new ArrayList<>(); //order list
        order.add(new VegItem("Paneer Pizza",200,2)); //add veg
        order.add(new NonVegItem("Chicken Burger",150,3)); //add non-veg
        processOrder(order); //process order
    }
    public static void processOrder(List<FoodItem> order){
        for(FoodItem item:order){
            item.getItemDetails(); //display details
            double total=item.calculateTotalPrice(); //calculate price
            if(item instanceof Discountable){
                Discountable d=(Discountable)item;
                double discount=d.applyDiscount(); //apply discount
                System.out.println("Discount: "+discount+"\nInfo: "+d.getDiscountDetails()); //discount info
                total-=discount; //update total
            }
            System.out.println("Final Price: "+total); //print final
            System.out.println("------------------------------"); //separator
        }
    }
}
