package Assignment2;


public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount() {

    }

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        balance = 0;
    }
    public void deposit(double amount){
        balance = amount +balance;
        System.out.println("Total amount after deposit- $"+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount) {
            balance = balance - amount;
            System.out.println("Total amount after withdraw- $" + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
    public void displayAccount(){
        System.out.println("Accountholder name - " +accountHolder);
        System.out.println("AccountNumber - "+ accountNumber);
        System.out.println("Balance - "+ balance);

    }

}
