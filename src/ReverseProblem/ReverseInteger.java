package ReverseProblem;

public class ReverseInteger {
    //   Reverse an Integer
    // Input: 1234 → Output: 4321
    public static void main(String[] args) {
        int num =1234;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;              // Get last digit
            reversed = reversed * 10 + digit;     // Add digit to reversed number
            num = num / 10;                 // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}


