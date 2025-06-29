package ASSIGNMENT3;

public class  Student extends Person {

   /* Subclass: Student (Inherits Person) o Additional Fields: studentId (String), course (String),
    gpa (double). o Constructor: Accepts name, age, studentId, course, and gpa.
            Use this to initialize studentId, course, and gpa, and super to call the base class
constructor. o Override Methods: ▪ displayInfo(): Prints name, age, studentId, course, and gpa. ▪
    Use polymorphism to change the output based on the Person reference type.
   */

   String studentId;
   String course;
   double gpa;

    public Student(String name, int age, String studentId, String course, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID -"+studentId);
        System.out.println("course -"+course);
        System.out.println("GPA -"+gpa);
    }
}