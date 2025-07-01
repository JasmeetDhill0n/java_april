package LinkedListExercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CityList {
    /*Create a LinkedList<String> to store city names.
Add 5 cities to the list.
Print the full list.
Add a new city at the beginning.
Add another city at the end.
Remove a specific city by name.
Check if a city exists in the list.
Print the final list.
     */

    public static void main(String[] args) {
        List<String> cityList = new LinkedList<> ();
        cityList.addAll(Arrays.asList("Amritsar","Jalandhar","Patiala","sangrur","Ludhiana"));
        cityList.add(0,"Chandigarh");
        cityList.set(4,"Ferozpur");
        cityList.remove(3);
        System.out.println(cityList);

    }
}
