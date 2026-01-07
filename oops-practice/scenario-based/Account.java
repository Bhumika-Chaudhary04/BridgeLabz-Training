package OnlineBankingManagementSystem;
import java.util.*;
abstract class Account implements BankService {
    protected int accountNumber;
    protected String holderName;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited " + amount);
    }
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount)
            throw new InsufficientBalanceException("❌ Insufficient Balance");
        balance -= amount;
        transactions.add("Withdrawn ₹" + amount);
    }
    public double getBalance() {
        return balance;
    }
    public synchronized void transfer(Account target, double amount)
            throws InsufficientBalanceException {
        this.withdraw(amount);
        target.deposit(amount);
        transactions.add("Transferred " + amount + " to A/C " + target.accountNumber);
        target.transactions.add("Received " + amount + " from A/C " + this.accountNumber);
    }
    public void showTransactions() {
        System.out.println("\n Transaction History:");
        for (String t : transactions)
            System.out.println(t);
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}
