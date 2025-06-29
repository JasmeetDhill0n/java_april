package May17;

public class Employee {

    public Employee(int i, double v, String jasmeet, String kaur, String mail) {
    }

    public String name(String firstname) {
        return firstname;
    }

    public String name(String firstname, String middlename) {

        return firstname + middlename;
    }

    public String name(String firstname, String middlename, String lastname) {

        return firstname + middlename + lastname;
    }

    public double salary(double baseSalary) {
        return baseSalary;
    }

    public double salary( double baseSalary,double bonus){
        return baseSalary+bonus;

    }
    public double salary( double baseSalary,double bonus,double incentives){
        return baseSalary+bonus+incentives;

    }
}
