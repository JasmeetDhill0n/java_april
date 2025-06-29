package strings;

public class Exercise3 {
    //Given a string "Java is fun", write code to:
    //
    //Replace "fun" with "awesome".
    //
    //Print each word on a new line using split().

    public static void main(String[] args) {
        String name = "Java is Fun";
       name = name.replace("Fun","awesome");
       System.out.println(name);

        String[] words = name.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}
