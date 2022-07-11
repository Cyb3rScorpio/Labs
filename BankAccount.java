public class BankAccount {
    private String customerName;
    private Integer accountNumber;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.err.println("Insufficient Funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
