package StringAndArrayAssignment;

import java.util.Scanner;

public class CustomerFeedback {
   // Customer Feedback System A restaurant collects feedback from customers.
    // Create a Java program that stores customer reviews (up to 5) in an array.
    // Write functions that: • Displays all customer reviews. •
    // Allows the user to search for specific words in the reviews and returns reviews that match.

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] reviews = new String[5];

            System.out.println("Enter 5 customer reviews:");
            for (int i = 0; i < 5; i++) {
                reviews[i] = sc.nextLine();
            }


            System.out.println("\nAll Reviews:");
            for (int i = 0; i < 5; i++) {
                System.out.println(reviews[i]);
            }
            System.out.print("\nEnter word to search: ");
            String word = sc.nextLine();

            System.out.println("\nReviews containing the word \"" + word + "\":");
            boolean found = false;

            for (int i = 0; i < 5; i++) {
                if (reviews[i].toLowerCase().contains(word.toLowerCase())) {
                    System.out.println(reviews[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No reviews found with that word.");
            }

            sc.close(); // Close the scanner
        }
}
