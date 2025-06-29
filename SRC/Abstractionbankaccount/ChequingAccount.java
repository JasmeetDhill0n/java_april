package Abstractionbankaccount;

public class ChequingAccount extends BankAccount {

    public ChequingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double deposit(double amount) {
        this.amount += amount;
        return this.amount;
    }

    @Override
    public double withdraw(double amount) {
        this.amount -= amount;
        return this.amount;
    }
}