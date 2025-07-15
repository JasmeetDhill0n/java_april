package HashMapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    //1. 🔡 Store and Print Student Grades
    //Question:
    //Create a HashMap to store student names as keys and their grades as values. Add 3 students and print the map.
    public static void main(String[] args) {
        Map<String,Integer> list = new HashMap<>();
        list.put("Jas",98);
        list.put("Arsh",76);
        list.put("Gurjot",78);

        for(Map.Entry<String,Integer> entry : list.entrySet() ){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        //2 Find a Student’s Grade
        //Question:
        //Ask the user to enter a student name and check if the student exists in the map. If yes, print their grade.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name you want to search - ");
        String name = scanner.nextLine();

        if(list.containsKey(name)){
            System.out.println(list.get(name));
        }

        //3. ➕ Add Only If Absent
        //Question:
        //Use putIfAbsent() to add a new student to the map. Try adding the same key twice and observe the result.


            list.putIfAbsent("maher",56);
            System.out.println(list);
            list.remove("Jas");
            System.out.println(list);
            System.out.println("size - "+list.size());
            System.out.println(list.hashCode());
            System.out.println(list.isEmpty());


    }
}
