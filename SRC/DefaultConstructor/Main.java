package DefaultConstructor;

public class Main {
        public static void main(String[] args) {
            Student student = new Student();  // Calls default constructor automatically

            // Set values manually
            //student.name = "Jasmeet";
            //student.age = 26;

            System.out.println(student.name);
            System.out.println(student.age);
        }
    }

