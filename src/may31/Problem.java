package may31;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println(input.length());

        char[] chars = input.toCharArray();

       int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }


        }
        System.out.println(count);



    }
}

