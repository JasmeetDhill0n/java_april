package strings;

import java.util.Scanner;

public class ReverseUserinput {public static void main(String[] args) {

    // Step 1: Create Scanner object to read input from user
    Scanner scanner = new Scanner(System.in);

    // Step 2: Ask the user to enter a string
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();  // Read user input string

    // Step 3: Convert the string to a char array
    char[] arr = input.toCharArray();

    // Step 4: Reverse the array using start and end index
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    // Step 5: Convert the reversed char array back to string
    String reversed = new String(arr);

    // Step 6: Print the reversed string
    System.out.println("Reversed string: " + reversed);

    scanner.close();  // Close the scanner
}

}
