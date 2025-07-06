package July5Map;

public class Employee {
    //Employee: empId, firstName, lastName, salary, company
    //
    //map<String, employee>
    //
    //create a map of employee_empId and employee
    //
    //put 5 entries, use put, putifabsent, get, values, keys, entryset


    String firstName;
    String lastName;
    String salary;
    String company;

    public Employee(String firstName, String lastName, String salary, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
