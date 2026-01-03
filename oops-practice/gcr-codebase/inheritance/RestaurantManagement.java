package inheritance;
// Superclass
class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
// Interface
interface Worker {
    void performDuties();
}
// Subclass 1: Chef
class Chef extends Person implements Worker {
    String specialty;
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes specializing in " + specialty);
    }
}
// Subclass 2: Waiter
class Waiter extends Person implements Worker {
    int tableNumber;
    Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at table " + tableNumber);
    }
}
// Main class
public class RestaurantManagement {
    public static void main(String[] args) {
        Worker w1 = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Worker w2 = new Waiter("Alice Johnson", 102, 5);
        // Display duties
        w1.performDuties();
        w2.performDuties();
        System.out.println();
        // Using Person reference for Chef
        Person p1 = new Chef("Jamie Oliver", 103, "Desserts");
        p1.displayPersonInfo();
        // Casting to Worker to call interface method
        ((Worker)p1).performDuties();
    }
}
