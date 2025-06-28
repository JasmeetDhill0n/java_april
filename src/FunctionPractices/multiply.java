package FunctionPractices;

import java.util.Scanner;

public class multiply {
    public static int mul(int a ,int b){
        int mul = a*b;
        return(mul);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value a - ");
        int a = scanner.nextInt();

        System.out.println("enter value  b -  ");
        int b = scanner.nextInt();

        int result = mul(a,b);
        System.out.println("Result "+ result);

    }
}
