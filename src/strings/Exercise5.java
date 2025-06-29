package strings;

public class Exercise5 {
    //Exercise 5: Word Count
    //Goal: Count how many words are in a sentence.
    //Example: "I love Java" → 3 words
    //✅ String methods used: .split(" "), .length
    public static void main(String[] args) {
        String  name = "i Love java";

        String [] word = name.split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
        System.out.println(word.length);


    }
}
