package arrays;

import java.util.Scanner;

public class SumOfFloatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter for how many number you want sum - ");
        int n = scanner.nextInt();

        System.out.println("enter the number you want sum - ");

        float [] number = new float[n];
//    float[] number = new float[5];

//    number[0]=1.2f;
//    number[1]=2.2f;
//    number[2]=3.2f;
//    number[3]=4.2f;
//    number[4]=5.2f;

    float sum =0;

    for(int i =0;i<n;i++){

        number[i] = scanner.nextFloat();
        sum = sum + number[i];

    }
        System.out.println("sum of float number -"+sum);
        }

}
