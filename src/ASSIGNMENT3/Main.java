package ASSIGNMENT3;

public class Main {
    //Class: Main o Set the university name using the static method in the University class.
    // o Create an array of Person references containing a mix of Student, Professor, and DepartmentHead
    // objects. o Iterate over the array and call displayInfo() on each object
    // (demonstrating polymorphism). o Increment the totalStudents and totalProfessors counters
    // whenever a Student or Professor object is added. o Display the university statistics at the end.
    public static void main(String[] args) {
        University.setUniversityName("Toronto univeristy");
        Person[] people = new Person[3];
        people[0] = new Student("Jasmeet kaur", 26, "jas123", "java", 3.99);
        people[1] = new Professor("Alex", 45, "IT", "ALEX123", 67000);
        people[2] = new DepartmentHead("selina", 45, "IT", "sel123", 80000, "102");


        for (int i = 0; i < people.length; i++) {
            System.out.println("\n");
            people[i].display();

        }

        University.getStatistics();
    }
}

