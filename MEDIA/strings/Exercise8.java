package strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercise8 {
    // Exercise 8: Count a Specific Letter
    //Goal: Ask the user for a letter and count how many times it appears in a sentence.
    //Example: "Java is awesome", letter = a → appears 3 times
    //✅ String methods used: .charAt(), .toLowerCase(), .equalsIgnoreCase()

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the word - ");
        String word = scanner.nextLine();

        int counter =0 ;

        for(int i=0;i<word.length();i++){
           if( word.charAt(i) == 'a' || word.charAt(i) == 'A'){
               counter++;
            }

        }
        System.out.println(counter);

    }
}
