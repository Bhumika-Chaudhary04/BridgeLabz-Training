package OnlineBankingManagementSystem;
class TransactionThread extends Thread {
    private Account from;
    private Account to;
    private double amount;
    public TransactionThread(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    public void run() {
        try {
            from.transfer(to, amount);
            System.out.println("✅ Transfer of ₹" + amount + " successful");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
