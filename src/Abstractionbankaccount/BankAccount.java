package Abstractionbankaccount;

public abstract class BankAccount {
    String accountNumber;
    Double amount;

    public BankAccount(String accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);

    public void dispalyBalance() {

    }

    public void displayAccount() {
    }
}
