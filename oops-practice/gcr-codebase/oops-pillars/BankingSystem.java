package oops_pillars;
import java.util.*;
//interface for loanable accounts
interface Loanable {
    void applyForLoan(double amount); //apply for loan
    double calculateLoanEligibility(); //calculate eligibility
}
//abstract base class for bank accounts
abstract class BankAccount {
    private String accountNumber; 
    private String holderName; 
    protected double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void deposit(double amount) {
        balance += amount; //deposit money
    }
    public void withdraw(double amount) {
        if(amount <= balance) balance -= amount; //withdraw money
    }
    public String getAccountNumber() { return accountNumber; } //get account number
    public String getHolderName() { return holderName; } //get holder name
    public double getBalance() { return balance; } //get balance

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Balance       : " + balance);
    }
    public abstract double calculateInterest(); //abstract interest
}

//savings account with interest
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNum, String name, double balance) {
        super(accNum,name,balance);
    }
    @Override
    public double calculateInterest() {
        return balance*0.04; //4% interest
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("loan applied: " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return balance * 0.5; //eligible 50% of balance
    }
}

//current account with minimal interest
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNum, String name, double balance) {
        super(accNum, name, balance);
    }
    @Override
    public double calculateInterest() {
        return balance * 0.01; //1% interest
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("loan applied: " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return balance * 0.3; //eligible 30% of balance
    }
}
//main class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV101", "Alice", 50000)); //add savings
        accounts.add(new CurrentAccount("CUR102", "Bob", 40000)); //add current
        for(BankAccount acc : accounts) {
            acc.displayDetails(); //display info
            System.out.println("Interest: " + acc.calculateInterest()); //interest
            if(acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Loan eligibility: " + loan.calculateLoanEligibility());
                loan.applyForLoan(10000); //apply loan
            }
            System.out.println("------------------------------");
        }
    }
}
