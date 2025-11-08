import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
        } else {
            System.out.println("⚠️ Insufficient balance!");
        }
    }

    public void transfer(double amount, String receiverId) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Transferred ₹" + amount + " to " + receiverId);
        } else {
            System.out.println("⚠️ Insufficient balance!");
        }
    }

    public void showTransactionHistory() {
        System.out.println("📜 Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}
