package june28;

public class Employees implements Comparable<Employees> {
    private int id;
    private double salary;
    private String firstName;
    private String lastName;
    private String email;


    // Constructor
    public Employees(int id, double salary, String firstName, String lastName, String email){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;


    }



    // Implement Comparable to sort by first name
    @Override
    public int compareTo(Employees e) {
        return this.firstName.compareToIgnoreCase(e.getFirstName());
    }

    // toString method for display
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Setters (optional if you need to modify later)
    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
}