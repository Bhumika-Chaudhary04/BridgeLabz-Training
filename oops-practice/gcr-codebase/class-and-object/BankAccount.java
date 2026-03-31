package class_and_object;
// BankAccount class represents a bank account
public class BankAccount {
    // Private fields (Encapsulation)
    private String accountHolder;
    private String accountNumber;
    private double balance;
    // Constructor to initialize bank account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: "+balance);
    }
    // Method to deposit money
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited: "+amount);
        displayBalance();
    }
    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount<=balance) {
            balance-=amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Main class to test ATM simulation
class ATM {
    public static void main(String[] args) {
        System.out.println("State of Chennai\n");
        // Creating BankAccount object
        BankAccount account=new BankAccount("Rohan", "ACC001", 700.0);
        // Display current balance
        account.displayBalance();
        // Deposit money
        account.deposit(200.0);
        // Withdraw money
        account.withdraw(100.0);
        // Attempt to withdraw more than balance
        account.withdraw(1000.0);
    }
}
