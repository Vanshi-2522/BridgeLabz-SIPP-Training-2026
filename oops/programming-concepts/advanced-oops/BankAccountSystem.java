class BankAccount {

    static String bankName = "SBI Bank";
    static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {

        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Holder: " + accountHolderName);
        }
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("101", "Rahul");
        BankAccount b2 = new BankAccount("102", "Aman");

        b1.display();
        b2.display();

        BankAccount.getTotalAccounts();
    }
}