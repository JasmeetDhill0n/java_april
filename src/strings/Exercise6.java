package strings;

public class Exercise6 {
    //Exercise 6: Reverse Each Word
    //Goal: Reverse each word in the sentence but keep the word order.
    //Example: "Java is fun" → "avaJ si nuf"
    //✅ String methods used: .split(), .charAt(), .length()
    public static void main(String[] args) {
        String name = "java is Fun";
        // Step 1: Split sentence into words
        String[] words = name.split(" ");

        // Step 2: Prepare empty string to store final answer
        String result = "";

        // Step 3: Loop through each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];  // get one word
            String reverse = "";// empty string to store reversed word

            // Step 4: Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);  // build the word in reverse
            }

            // Step 5: Add reversed word to final result
            result = result + reverse + " ";
        }

        // Step 6: Print the final sentence (trim to remove extra space)

        System.out.println(result.trim());
    }
}
