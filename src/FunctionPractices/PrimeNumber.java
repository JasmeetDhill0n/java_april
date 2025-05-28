package FunctionPractices;

import java.util.Scanner;

public class PrimeNumber {
        // Function to check if number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            // Check if any number divides it
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a number (or -1 to exit): ");
                int num = scanner.nextInt();

                if (num == -1) {
                    System.out.println("Goodbye!");
                    break;
                }

                if (isPrime(num)) {
                    System.out.println(num + " is a PRIME number.");
                } else {
                    System.out.println(num + " is NOT a prime number.");
                }
            }
        }
    }

