package ReverseProblem;

public class ReverseWord {
    //. Reverse Words in a Sentence (word order)
    //Input: "Java is fun" → Output: "fun is Java"
    //✅ Teaches you split(), arrays, and loops.

    public static void main(String[] args) {
        String word = "My name is Jasmeet";
        String reversed = "";
        String[] words = word.split(" ");

        // Step 2: Print the words from end to start
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

