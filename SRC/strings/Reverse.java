package strings;

public class Reverse {
        public static void main(String[] args) {
            String str = "hello";

            // Step 1: Convert to char array
            char[] arr = str.toCharArray();

            // Step 2: Use two pointers to reverse
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            // Step 3: Convert char array back to string
            String reversed = new String(arr);

            // Output the result
            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversed);
        }
    }