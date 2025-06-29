package bookstoreexceptionproblem;

import june17exceptionAssignment.InsufficientBalanceException;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Q;

public class BookStore {

    int balance;
    String[] code = {"A", "B", "C", "D", "E"};
    int[] price = {10, 20, 30, 20, 10};

    public BookStore(int balance) {
        this.balance = balance;
    }

    int total = 0;


    Scanner scanner = new Scanner(System.in);

    public void bill() {
        while (true) {
            System.out.println("enter the item code from A TO E - ");
            String choice = scanner.nextLine();
            if (choice.equals("Q")) {
                System.out.println("Thank you! Final bill amount: $" + total);
                break;
            }

            boolean found = false;
            int newtotal;

            for (int i = 0; i < code.length; i++)
                if (choice.equalsIgnoreCase(code[i])) {
                    newtotal = total + price[i];
                    found = true;
                    System.out.println("total price  -" + total);
                }
            if (total > balance) {
                System.out.println("item cannot added to list ");
                System.out.println("total price = " + total);
                try {
                    throw new InsufficientBalanceException("balance too low for item" + choice);
                } catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                newtotal = total;
                System.out.println("item added" + newtotal);

            }

            if (!found) {
                System.out.println("invalid code");


            }
        }
    }
}

