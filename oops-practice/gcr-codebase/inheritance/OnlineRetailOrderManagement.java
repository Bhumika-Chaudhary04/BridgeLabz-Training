package inheritance;
// Base class
class Order {
    String orderId;
    String orderDate;
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}
// Level 1 subclass
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
// Level 2 subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
// Main class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("ORD101", "01-01-2026");
        Order o2 = new ShippedOrder("ORD102", "02-01-2026", "TRK5678");
        Order o3 = new DeliveredOrder("ORD103", "03-01-2026", "TRK9876", "05-01-2026");
        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}
