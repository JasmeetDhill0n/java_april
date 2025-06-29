package strings;

import java.util.Scanner;

public class Exercise1 {
    //Ask the user to enter an email address, and check:
   // Does it contain "@"?
   // Does it end with “.com”?
    //Convert it to lowercase.


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the email address - ");
        String emailAddress = scanner.nextLine();

        System.out.println(emailAddress.contains("@"));

        System.out.println(emailAddress.endsWith(".com"));

        System.out.println("lower case  - "+emailAddress.toLowerCase());

    }
}
