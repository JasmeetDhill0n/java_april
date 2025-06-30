package Assignment2;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public BankAccount(String accountHolderName, String accountNumber) {
        this(accountHolderName, accountNumber, 0);
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount);
                System.out.println("Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient balance to withdraw $" + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

  
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}