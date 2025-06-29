package May6;

import java.util.Scanner;

public class OddEven {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter x value");
    int x = scanner.nextInt();

    if (x % 2 == 0) {
        System.out.println("X is a even number");
    } else {
        System.out.println("X is odd number");
    }
}

}
