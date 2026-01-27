package exceptions;
import java.util.*;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
public class BankTransactionSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter balance : ");
		double balance=sc.nextDouble();
		System.out.print("Enter amount : ");
		double amount=sc.nextDouble();
		try {
			withdraw(balance,amount);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void withdraw(double balance,double amount) throws InsufficientBalanceException,IllegalArgumentException{
		if(amount<0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		if(balance<amount) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		balance-=amount;
		System.out.println("Withdrawal successful, new balance: "+balance);
	}
}
