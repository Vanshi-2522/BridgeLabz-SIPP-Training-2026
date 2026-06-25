class BankAccount {

    public String accountNumber;

    protected String accountHolder;

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public void display() {

        System.out.println(accountNumber);

        System.out.println(accountHolder);
    }
}