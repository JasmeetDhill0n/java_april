package SetCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordCounter {
   /* Unique Words Counter
    Read a sentence (string) from the user.
    Use a HashSet<String> to store unique words from the sentence.
    Print the count of unique words.
    Print all unique words sorted alphabetically (hint: use a TreeSet).
    */

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Read a sentence from user
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            // 2. Split sentence into words
            String[] words = sentence.split(" ");

            // 3. Use HashSet to store unique words
            Set<String> uniqueWords = new HashSet<>();
            for (String word : words) {
                uniqueWords.add(word.toLowerCase()); // to ignore case
            }

            // 4. Print total unique word count
            System.out.println("Total unique words: " + uniqueWords.size());

            // 5. Use TreeSet to sort words alphabetically
            TreeSet<String> sortedWords = new TreeSet<>(uniqueWords);

            System.out.println("Unique words (sorted):");
            for (String word : sortedWords) {
                System.out.println(word);
            }
        }
    }


