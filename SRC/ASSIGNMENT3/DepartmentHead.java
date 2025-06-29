package ASSIGNMENT3;

public class DepartmentHead extends Professor{
    //New Subclass: DepartmentHead (Inherits Professor) o Additional Field: officeRoom (String).
    // o Constructor: Accepts all Professor parameters plus officeRoom. o
    // Override Methods: ▪ displayInfo(): Prints all Professor details along with officeRoom.

    String officeRoom;

    public DepartmentHead(String name, int age, String department, String employeeId, double salary, String officeRoom) {
        super(name, age, department, employeeId, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office room - "+officeRoom);
    }
}
