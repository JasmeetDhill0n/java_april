package InternalImplentationOfHashcod;

import java.util.HashMap;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Arsh");
        Student s2 = new Student(1, "Arsh");
        Student s3 = new Student(2, "Satwinder");

        HashMap<Student, String> info = new HashMap<>();
        info.put(s1, "Math");
        info.put(s2, "Science");
        info.put(s3, "Chemistry");

        System.out.println("Get s1: " + info.get(s1));
        System.out.println("Get s2: " + info.get(s2));
        System.out.println("Map: " + info);
    }
}