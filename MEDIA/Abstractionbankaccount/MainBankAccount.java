package Abstractionbankaccount;

public class MainBankAccount {

        public static void main(String[] args) {

            BankAccount chequingAccount = new ChequingAccount("jasmeet", 1000.90);
            chequingAccount.deposit(500);
            chequingAccount.withdraw(100);
            chequingAccount.dispalyBalance();

            System.out.println();

            BankAccount savingAccount = new SavingAccount("jasmeet", 300000.80);
            savingAccount.deposit(1000);
            savingAccount.withdraw(500);
            savingAccount.dispalyBalance();
        }
    }