package FunctionPractices;

import java.util.Scanner;

public class Sum {
    public static int sum(int a,int b){
        return a+b; // int sum = a+b;( another way of writing)
                    // return sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value of a -");
        int a = scanner.nextInt();

        System.out.println("enter the value of b - ");
        int b = scanner.nextInt();

        int result = sum(a,b);
        System.out.println("result - " + result);
    }

}
