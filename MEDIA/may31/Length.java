package may31;

public class Length {
    public static void main(String[] args) {
        String doc = "The class String includes methods for examining individual characters of the sequence";
        System.out.println(doc.length());

        String result = doc.replace(" ", "");
        System.out.println(result);
        System.out.println(result.length());

        int wordCount = doc.split(" ").length;
        System.out.println(wordCount);

        // find number of word ,letter,spaces,special character












    }
}
