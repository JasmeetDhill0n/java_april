package ASSIGNMENT3;

public class Professor extends Person {

    /*Subclass: Professor (Inherits Person) o Additional Fields: employeeId (String),
     department (String), salary (double). o Constructor: Accepts name, age, employeeId, department,
     and salary. Use this and super appropriately. o Override Methods: ▪
     displayInfo(): Prints name, age, employeeId, department, and salary.
     */

    String employeeId;
    String department;
    double salary;

    public Professor(String name, int age, String department, String employeeId, double salary) {
        super(name, age);
        this.department = department;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department -"+department);
        System.out.println("Employee Id - "+employeeId);
        System.out.println("Salary -"+salary);

    }
}
