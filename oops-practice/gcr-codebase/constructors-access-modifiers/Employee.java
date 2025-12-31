package constructors_access_modifiers;
public class Employee {
    // attributes
    public int employeeID;      // public
    protected String department; // protected
    private double salary;       // private
    // public setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // public getter for salary
    public double getSalary() {
        return salary;
    }
    // method to display employee details
    void display() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("----------------------------------");
    }
}
// subclass
class Manager extends Employee {
    // demonstrates access to protected member
    void showDepartment() {
        System.out.println("Department (Protected): " + department);
    }
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.employeeID = 201;         // public access
        mgr.department = "HR";        // protected access
        mgr.setSalary(75000);         // private via public setter
        mgr.display();
        mgr.showDepartment();
        // modify salary using public method
        mgr.setSalary(85000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}