package Abstractionbankaccount;

public abstract class BankAccount {
    String accountNumber;
    Double amount;

    public BankAccount(String accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    abstract double deposit(double amount);
    abstract double withdraw(double amount);

  public void dispalyBalance(){
      System.out.println("AccountNumber -  "+accountNumber);
      System.out.println("Total balance -  "+amount);


  }

}
