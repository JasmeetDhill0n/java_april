package SetCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EmailList {
   /* Email List Management
    Create a HashSet<String> to store email addresses.
    Add multiple email addresses (include some duplicates).
    Print all unique email addresses.
            Check if a certain email exists in the set.
    Remove an email address.

    */

    public static void main(String[] args) {
        Set<String> email =new HashSet<>();
        email.addAll(Arrays.asList("jaskaur@gmail.com","Arsh567@gmail.com","jas","jas","arsh9","jddbd"));

        System.out.println("unique email as below - ");
        for(String unique : email){
            System.out.println(unique);
        }
        // 2. Check if a specific email exists
        String checkEmail = "jas";
        if (email.contains(checkEmail)) {
            System.out.println("\nEmail '" + checkEmail + "' exists in the list.");
        } else {
            System.out.println("\nEmail '" + checkEmail + "' does not exist.");
        }

        // 3. Remove an email address
        String removeEmail = "jas";
        boolean removed = email.remove(removeEmail);

        if (removed) {
            System.out.println("Email '" + removeEmail + "' has been removed.");
        } else {
            System.out.println("Email '" + removeEmail + "' was not found.");
        }

        // 4. Final email list
        System.out.println("\nFinal email list:");
        for (String emails : email) {
            System.out.println(email);
        }
    }
}

