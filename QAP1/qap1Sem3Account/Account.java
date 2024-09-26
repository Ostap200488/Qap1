
public class Account {
    private double balance;
    private String accountNumber;
    
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0.0) {
            balance = initialBalance;
        } else {
            balance = 0.0;
            System.out.println("Initial balance cannot be negative. Setting balance to $0.00");
        }
    }
    public double getBalance() {
        return balance;
    }
    public boolean transfer(Account toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            toAccount.balance += amount;
            return true; // Transfer successful
        }
        System.out.println("Transfer failed: Insufficient funds or invalid amount.");
        return false; // Transfer failed
    }
    public void displayAccountDetails() {
        System.out.printf("Account Number: %s | Balance: $%.2f%n", accountNumber, balance);
    }
}