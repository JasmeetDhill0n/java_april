package Assignment2;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {

        System.out.println("Simple Bank amount"); // welcome message.

        Scanner scanner = new Scanner(System.in);


        BankAccount bankaccount = new BankAccount("Jasmeet", "434945858", 100);
        BankAccount bankaccount1 = new BankAccount("Arsh", "434978898");

        System.out.println("Enter 1 for Jasmeet's account or 2 for Arsh's account:");
        int Choice = scanner.nextInt();

        BankAccount accountOption;

        while(true) {
        if (Choice == 1) {
            accountOption= bankaccount;
            bankaccount.displayAccount();


        } else if (Choice == 2) {
            accountOption = bankaccount1;
            bankaccount1.displayAccount();

        } else {
            System.out.println("Invalid account selection.");
            return;
        }


            System.out.println("ENTER 1 FOR DEPOSIT , ENTER 2 FOR WITHDRAW ,ENTER 3 FOR EXIT -  ");
            int option = scanner.nextInt();

            if (option == 1) {

                System.out.println("please enter the amount you want to deposit -  ");
                double amount = scanner.nextDouble();
                accountOption.deposit(amount);

            } else if (option == 2) {
                System.out.println("please enter the amount you want to withdraw -  ");
                double amount = scanner.nextDouble();
                accountOption.withdraw(amount);


            }
            else if  (option == 3) {
                System.out.println("Thank you. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid options");
                continue;
            }
        }
        }
        }






