package HashMapPractice;

import java.util.*;

public class StudentSubjectGrade {
    public static void main(String[] args) {
        // Step 1: Create student marks using simple HashMap
        Map<String, Integer> jasmeet = new HashMap<>();
        jasmeet.put("Math", 95);
        jasmeet.put("Science", 90);
        jasmeet.put("English", 85);

        Map<String, Integer> arsh = new HashMap<>();
        arsh.put("Math", 70);
        arsh.put("Science", 60);
        arsh.put("English", 75);

        Map<String, Integer> simran = new HashMap<>();
        simran.put("Math", 30);
        simran.put("Science", 40);
        simran.put("English", 50);

        // Outer map: student name -> subject marks map
        Map<String, Map<String, Integer>> studentMarks = new HashMap<>();
        studentMarks.put("Jasmeet", jasmeet);
        studentMarks.put("Arsh", arsh);
        studentMarks.put("Simran", simran);

        // Step 2: Remove students who failed in any subject (marks < 40)
        Iterator<Map.Entry<String, Map<String, Integer>>> iterator = studentMarks.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Map<String, Integer>> entry = iterator.next();
            Map<String, Integer> marks = entry.getValue();
            boolean hasFail = false;
            for (int m : marks.values()) {
                if (m < 40) {
                    hasFail = true;
                    break;
                }
            }
            if (hasFail) {
                iterator.remove();
            }
        }

        // Step 3: Print total and average marks for each student
        for (String name : studentMarks.keySet()) {
            Map<String, Integer> marks = studentMarks.get(name);
            int total = 0;
            for (int m : marks.values()) {
                total += m;
            }
            double average = total / (double) marks.size();
            System.out.println(name + " Total: " + total + ", Average: " + average);
        }

        // Step 4: Add new student from user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter new student name: ");
        String newStudent = sc.nextLine();

        Map<String, Integer> newStudentMarks = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter subject name: ");
            String subject = sc.nextLine();
            System.out.print("Enter marks for " + subject + ": ");
            int mark = Integer.parseInt(sc.nextLine());
            newStudentMarks.put(subject, mark);
        }

        studentMarks.put(newStudent, newStudentMarks);
        System.out.println("Student added: " + newStudent);

        // Step 5: Print all students again with updated data
        System.out.println("\nUpdated Student List:");
        for (String name : studentMarks.keySet()) {
            Map<String, Integer> marks = studentMarks.get(name);
            int total = 0;
            for (int m : marks.values()) {
                total += m;
            }
            double average = total / (double) marks.size();
            System.out.println(name + " Total: " + total + ", Average: " + average);
        }
    }
}
