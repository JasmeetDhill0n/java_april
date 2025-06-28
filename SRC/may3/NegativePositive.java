package may3;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE VALUE - ");
        int x = scanner.nextInt();


if (x<0){
    System.out.println("x is negative");
}
else {
    System.out.println("x is positive");
}
    }
}
