package FunctionPractices;

import java.util.Scanner;

public class EvenOdd {
    public static boolean check(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("enter n value -- ");
            int n = scanner.nextInt();

            if (check(n)) {
                System.out.println("GIVEN NUMBER IS EVEN NUMBER");
            }
            else {
                System.out.println("GIVEN NUMBER IS not EVEN NUMBER");
            }
        }

    }
}
