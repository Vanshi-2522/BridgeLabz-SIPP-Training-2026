// BankAccount class
class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder,
                       String accountNumber,
                       double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {

        balance += amount;

        System.out.println(
                amount + " deposited successfully.");
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(
                    amount + " withdrawn successfully.");
        } else {

            System.out.println(
                    "Insufficient balance.");
        }
    }

    // Display balance
    public void displayBalance() {

        System.out.println(
                "Current Balance : " + balance);
    }
}

// Main class
public class BankAccountATM {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(
                        "Rahul",
                        "ACC101",
                        10000);

        account.deposit(5000);

        account.withdraw(3000);

        account.displayBalance();
    }
}