package inheritance;
// Superclass
class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
// Subclass 2
class CheckingAccount extends BankAccount {
    int withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
// Subclass 3
class FixedDepositAccount extends BankAccount {
    int tenure; // in years
    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
// Main class
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA202", 30000, 5);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 100000, 3);
        sa.displayAccountType();
        sa.displayAccountDetails();
        System.out.println();
        ca.displayAccountType();
        ca.displayAccountDetails();
        System.out.println();
        fd.displayAccountType();
        fd.displayAccountDetails();
    }
}
