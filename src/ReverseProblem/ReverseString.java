package ReverseProblem;

public class ReverseString {
    // Reverse a String
    //Problem: Reverse the string "hello" to "olleh".
    public static void main(String[] args) {
        String word = "hello";
        String reversed = "";
        //You can access any character using:
        //str.charAt(index)

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed+= word.charAt(i);
        }
        System.out.println("String after Reversed - "+reversed);
    }
}
