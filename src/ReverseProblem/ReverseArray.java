package ReverseProblem;

import java.util.Arrays;

public class ReverseArray {
    //Reverse the array {1, 2, 3, 4, 5} to {5, 4, 3, 2, 1}.
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            int start = 0, end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            System.out.println("Reversed Array: " + Arrays.toString(arr));
        }
    }