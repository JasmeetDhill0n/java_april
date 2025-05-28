package may27;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word to check if it's a palindrome: ");
            String word = scanner.next();

            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed+ word.charAt(i);
            }
        System.out.println("reversed string  = "+reversed);

            if (word.equals(reversed)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }

        }
    }