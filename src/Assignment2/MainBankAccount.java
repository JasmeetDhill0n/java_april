package Assignment2;

import java.util.Scanner;

public class MainBankAccount  {
    public static void main(String[] args) {

        System.out.println("Simple Bank Account"); // welcome message

        Scanner scanner = new Scanner(System.in);

        BankAccount bankaccount = new BankAccount("Jasmeet", "434945858", 100);
        BankAccount bankaccount1 = new BankAccount("Arsh", "434978898");

        while (true) {
            System.out.println("\nEnter 1 for Jasmeet's account or 2 for Arsh's account (or 3 to exit):");
            int choice = scanner.nextInt();

            BankAccount accountOption;

            if (choice == 1) {
                accountOption = bankaccount;
                accountOption.displayAccount();
            } else if (choice == 2) {
                accountOption = bankaccount1;
                accountOption.displayAccount();
            } else if (choice == 3) {
                System.out.println("Thank you. Goodbye!");
                break;
            } else {
                System.out.println("Invalid account selection.");
                continue;
            }

            while (true) {
                System.out.println("\nENTER 1 FOR DEPOSIT, 2 FOR WITHDRAW, 3 TO SWITCH ACCOUNT, 4 TO EXIT:");
                int option = scanner.nextInt();

                if (option == 1) {
                    System.out.println("Please enter the amount you want to deposit:");
                    double amount = scanner.nextDouble();
                    accountOption.deposit(amount);

                } else if (option == 2) {
                    System.out.println("Please enter the amount you want to withdraw:");
                    double amount = scanner.nextDouble();
                    accountOption.withdraw(amount);

                } else if (option == 3) {
                    break;

                } else if (option == 4) {
                    System.out.println("Thank you. Goodbye!");
                    scanner.close();
                    return;

                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }

        scanner.close();
    }
}





