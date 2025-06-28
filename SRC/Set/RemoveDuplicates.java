package Set;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 56, 20, 10);

      //  Set<Integer> list2 = new LinkedHashSet<>(list);
        // New list to store only unique values
        List<Integer> list2 = new ArrayList<>();


        for (Integer num : list) {
            if (!list2.contains(num)) {
                list2.add(num); //
            }
        }

        List<Integer> list3 = new ArrayList<>(list);

        // Sort in ascending order
        Collections.sort(list3);

        System.out.println("Original List: " + list);
        System.out.println("List after removing duplicates: " + list2);
        System.out.println("list in ascending order: "+list3);
    }
}

