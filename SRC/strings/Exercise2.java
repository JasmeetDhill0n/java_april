package strings;

import java.util.Scanner;

public class Exercise2 {
    /* Exercise 2:
Take a string from user input and:

Count how many times the letter 'a' appears.

Check if it starts with a capital letter.

Print the reversed string.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the nAME - ");
        String name = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                counter++;

            }
        }
        System.out.println(counter);

        if (name.length() > 0 && Character.isUpperCase(name.charAt(0))) {

            System.out.println("yes it start with capital letter");
        }
        else{
            System.out.println("no it start with capital letter");

        }
        String reverses= "";
        for(int i =name.length()-1;i>=0;i--){
            reverses = reverses+name.charAt(i);
        }
        System.out.println(reverses);
    }
}
