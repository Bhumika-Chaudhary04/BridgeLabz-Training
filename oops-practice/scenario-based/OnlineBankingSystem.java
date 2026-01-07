package OnlineBankingManagementSystem;
import java.util.*;
public class OnlineBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Account> accounts = new HashMap<>();
        while (true) {
            System.out.println("\n------ BANK MENU ------");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Transfer Funds");
            System.out.println("4. Transaction History");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    System.out.print("Account Type (1-Savings / 2-Current): ");
                    int type = sc.nextInt();
                    Account acc = (type == 1)
                            ? new SavingsAccount(accNo, name, bal)
                            : new CurrentAccount(accNo, name, bal);

                    accounts.put(accNo, acc);
                    System.out.println("✅ Account Created");
                    break;
                case 2:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    System.out.println("Balance: ₹" + accounts.get(accNo).getBalance());
                    break;
                case 3:
                    System.out.print("From Account: ");
                    int from = sc.nextInt();
                    System.out.print("To Account: ");
                    int to = sc.nextInt();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    new TransactionThread(
                            accounts.get(from),
                            accounts.get(to),
                            amt).start();
                    break;
                case 4:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    accounts.get(accNo).showTransactions();
                    break;
                case 5:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    System.out.println("Interest: " +
                            accounts.get(accNo).calculateInterest());
                    break;
                case 6:
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
