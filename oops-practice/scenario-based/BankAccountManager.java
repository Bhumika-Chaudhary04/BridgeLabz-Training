package scenario_based;
import java.util.*;
class BankAccount {
    private String accNumber;
    private double currentBalance;
    // constructor
    public BankAccount(String accNumber, double currentBalance) {
        this.accNumber = accNumber;
        this.currentBalance = currentBalance;
    }
    // Deposit Method
    public void deposit(double transactionAmount) {
        if (transactionAmount <= 0) {
            System.out.println("⚠ Deposit amount must be positive.");
            return;
        }
        currentBalance += transactionAmount;
        System.out.println("✔ Deposited: ₹" + transactionAmount);
    }
    // Withdraw Method
    public void withdraw(double transactionAmount) {
        if (transactionAmount <= 0) {
            System.out.println("⚠ Withdrawal amount must be positive.");
            return;
        }
        // prevent overdraft
        if (transactionAmount > currentBalance) {
            System.out.println("❌ Insufficient balance! Withdrawal denied.");
            return;
        }
        currentBalance -= transactionAmount;
        System.out.println("✔ Withdrawn: ₹" + transactionAmount);
    }
    // Check Balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + currentBalance);
    }
}
public class BankAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount("AC001", 5000);
        while (true) {
            System.out.println("\n🏦 Bank Account Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    userAccount.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    userAccount.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    userAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("👋 Thank you for banking with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠ Invalid choice! Try again.");
            }
        }
    }
}
