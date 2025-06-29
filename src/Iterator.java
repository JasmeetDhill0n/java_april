import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jasmeet");
        list.add("arsh");
        list.add("satwinder");
        list.add("maher");

        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();

            if (value.equals("arsh") ) {
                System.out.println("Removing: " + value);
                iterator.remove();
            }
        }

        System.out.println("Final list: " + list);
    }
}