package may24;

import java.util.Scanner;

public class NameArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many names you want to print: ");
        int size = scanner.nextInt();

        scanner.nextLine(); // to clear the newline character

        String[] names = new String[size];

        // Taking names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Printing names
        for (int i = 0; i < size; i++) {
            System.out.println("Name " + (i + 1) + " is: " + names[i]);
        }
    }
}