// TestAccount.java
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("ACC123456", 5000);
        Account acc2 = new Account("ACC654321", 4000);
        // Display initial balances
        System.out.println("Initial Balances:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        if (acc1.transfer(acc2, 1000)) {
            System.out.println("Transfer successful!");
        }
        System.out.println("\nBalances After Transfer:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}