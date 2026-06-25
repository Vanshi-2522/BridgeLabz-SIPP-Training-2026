abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber,
                       String holderName,
                       double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public void displayAccountDetails() {
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println("Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String acc, String name,
                          double balance, double rate) {
        super(acc, name, balance);
        interestRate = rate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public CurrentAccount(String acc, String name,
                          double balance, double rate) {
        super(acc, name, balance);
        monthlyBonusRate = rate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount("SA101", "Rahul", 50000, 5);

        CurrentAccount ca =
                new CurrentAccount("CA101", "Aman", 30000, 2);

        sa.deposit(5000);
        sa.withdraw(2000);

        ca.deposit(3000);
        ca.withdraw(1000);

        sa.displayAccountDetails();
        System.out.println("Interest: " +
                sa.calculateInterest());

        System.out.println();

        ca.displayAccountDetails();
        System.out.println("Interest: " +
                ca.calculateInterest());
    }
}