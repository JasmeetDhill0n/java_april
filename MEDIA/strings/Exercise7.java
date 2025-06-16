package strings;

public class Exercise7 {
    //Convert to Title Case
    //Goal: Capitalize the first letter of each word.
    //Example: "java is fun" → "Java Is Fun"
    //✅ String methods used: .substring(), .toUpperCase(), .toLowerCase(), .split()
    public static void main(String[] args) {
        String name = "java is fun";

        String[] words = name.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Capitalize first letter + keep rest of the word same
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            // Add it to result string
            result = result + capitalized + " ";
        }

        // Print the final result (remove extra space at the end)
        System.out.println(result.trim());
    }
}