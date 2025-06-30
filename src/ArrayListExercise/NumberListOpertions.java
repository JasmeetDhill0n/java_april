package ArrayListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberListOpertions {
   /* Number List Operations
    Create an ArrayList<Integer> with random numbers.
    Find the maximum and minimum numbers.
 Calculate the sum and average of numbers.
Remove all even numbers from the list.  */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,45,56,2,8,5,333,435,2,123,7));

        int maximum = list.get(0);
        int minimum = list.get(0);
        int sum = 0;

        // Loop through the list to find max, min and sum
        for (int num : list) {
            if (num > maximum) {
                maximum = num;
            }
            if (num < minimum) {
                minimum = num;
            }
            sum += num;
        }

        // Calculate average
        double average = (double) sum / list.size();

        // Print max, min, sum, average
        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Remove all even numbers using removeIf (Java 8+)
        list.removeIf(num -> num % 2 == 0);

        // Print list after removing even numbers
        System.out.println("List after removing even numbers: " + list);
    }
}
