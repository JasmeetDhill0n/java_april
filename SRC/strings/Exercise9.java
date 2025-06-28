package strings;

import java.util.Scanner;

public class Exercise9 {
    //Extract Domain from Email
    //Goal: Extract domain from an email
    //Example: "user@gmail.com" → "gmail.com"
    //✅ String methods used: .substring(), .indexOf('@')

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Ask the user to type an email
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            // Find where '@' is in the email
            int atPosition = email.indexOf('@');

            // Get everything after '@'
            String domain = email.substring(atPosition + 1);

            // Show the result
            System.out.println("Domain is: " + domain);

            scanner.close();
        }
    }