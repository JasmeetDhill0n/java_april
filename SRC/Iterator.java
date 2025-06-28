import java.util.ArrayList;
import java.util.List;


public class Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jasmeet");
        list.add("arsh");

        java.util.Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String value = iterator.next(); // move to next element
            System.out.println("Removing: " + value);
            iterator.remove(); // now safe to remove
        }

        System.out.println("Final list: " + list); // should be empty []
    }
}