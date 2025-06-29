package Abstractionbankaccount;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double deposit(double amount) {
        this.amount += amount*1.10;
        return this.amount;
    }

    @Override
    public double withdraw(double amount) {
        this.amount -= amount;
        return this.amount;
    }
}
