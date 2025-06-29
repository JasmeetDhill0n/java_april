package arrays;

import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] number = {0,20,30,40,50};
        System.out.println("enter the number you want to search - ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, it is in the array.");
        } else {
            System.out.println("No, it is not in the array.");
        }
    }
}