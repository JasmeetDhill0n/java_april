package arrays;

public class reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int start = 0; // Correct: index
        int end = numbers.length - 1;

        while (start < end) {
            // Swap values at indexes start and end
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        for (int i =0;i< numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
