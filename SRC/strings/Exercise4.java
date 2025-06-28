package strings;

import java.util.Scanner;

public class Exercise4 {
    // Exercise 4: Check Palindrome
    //Goal: Check if a string is the same forward and backward.
    //Example: "madam" → Palindrome

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the name - ");
        String name = scanner.nextLine();
        
        String reverse= "";
        for(int i = name.length()-1;i>=0;i--){
            reverse= reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if (name.equals(reverse)){
            System.out.println("name is palindrome");
        }
        else {
            System.out.println("name is not palindrome");
        }
        
        
    }
}
