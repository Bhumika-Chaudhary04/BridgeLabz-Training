package constructors_access_modifiers;
public class BankAccount {
    //attributes
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private
    //encapsulation
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    //method to display account details
    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------------");
    }
}
//subclass
class SavingsAccount extends BankAccount {
    //demonstrates access to protected member
    void showAccountHolder() {
        System.out.println("Account Holder (Protected): " + accountHolder);
    }
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.accountNumber = 123456;        // public access
        acc.accountHolder = "Rohit Kumar"; // protected access
        acc.setBalance(25000);             // private via setter
        acc.display();
        acc.showAccountHolder();
        //modifying balance using public method
        acc.setBalance(30000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}
