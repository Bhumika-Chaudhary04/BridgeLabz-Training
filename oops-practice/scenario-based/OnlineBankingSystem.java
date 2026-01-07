package OnlineBankingManagementSystem;
import java.util.*;
import java.util.*;
import java.util.*;
public class OnlineBankingSystem {
	static List<Account> accounts = new ArrayList<>();
	// Helper method to find account
	public static Account findAccount(int accNo) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo)
				return acc;
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n------ BANK MENU ------");
			System.out.println("1. Create Account");
			System.out.println("2. Check Balance");
			System.out.println("3. Transfer Funds");
			System.out.println("4. Transaction History");
			System.out.println("5. Calculate Interest");
			System.out.println("6. Delete Account");
			System.out.println("7. Exit");
			System.out.print("Choose option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: // CREATE
				System.out.print("Account Number: ");
				int accNo = sc.nextInt();
				sc.nextLine();

				if (findAccount(accNo) != null) {
					System.out.println("Account already exists");
					break;
				}
				System.out.print("Holder Name: ");
				String name = sc.nextLine();
				System.out.print("Initial Balance: ");
				double bal = sc.nextDouble();
				System.out.print("Account Type (1-Savings / 2-Current): ");
				int type = sc.nextInt();
				Account acc = (type == 1) ? new SavingsAccount(accNo, name, bal) : new CurrentAccount(accNo, name, bal);
				accounts.add(acc);
				System.out.println("Account Created");
				break;
			case 2: // READ
				System.out.print("Account Number: ");
				accNo = sc.nextInt();
				Account a = findAccount(accNo);
				if (a == null)
					System.out.println("Account not found");
				else
					System.out.println("Balance: " + a.getBalance());
				break;
			case 3: // UPDATE (Transfer)
				System.out.print("From Account: ");
				int fromNo = sc.nextInt();
				System.out.print("To Account: ");
				int toNo = sc.nextInt();
				System.out.print("Amount: ");
				double amt = sc.nextDouble();
				Account from = findAccount(fromNo);
				Account to = findAccount(toNo);
				if (from == null || to == null) {
					System.out.println("Invalid account number");
					break;
				}
				new TransactionThread(from, to, amt).start();
				break;
			case 4: // READ
				System.out.print("Account Number: ");
				accNo = sc.nextInt();
				a = findAccount(accNo);
				if (a == null)
					System.out.println("❌ Account not found");
				else
					a.showTransactions();
				break;
			case 5: // Polymorphism
				System.out.print("Account Number: ");
				accNo = sc.nextInt();
				a = findAccount(accNo);
				if (a == null)
					System.out.println("Account not found");
				else
					System.out.println("Interest: " + a.calculateInterest());
				break;
			case 6: // DELETE
				System.out.print("Account Number to delete: ");
				accNo = sc.nextInt();
				a = findAccount(accNo);
				if (a == null) {
					System.out.println("Account not found");
				} else if (a.getBalance() != 0) {
					System.out.println("Cannot delete account with non-zero balance");
				} else {
					accounts.remove(a);
					System.out.println("Account deleted successfully");
				}
				break;
			case 7:
				System.out.println("Thank you for banking with us!");
				sc.close();
				return;

			default:
				System.out.println("Invalid option");
			}
		}
	}
}
