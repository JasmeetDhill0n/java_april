package june28;

import May17.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MainEmployee {
    public static void main(String[] args) {
        List<Employees> employeeList = new ArrayList<>();

        // Add employees
        employeeList.add(new Employees(106, 55000.00, "Jasmeet", "Kaur", "jasmeet@example.com"));
        employeeList.add(new Employees(102, 65000.00, "Arshdeep", "Singh", "arsh@example.com"));
        employeeList.add(new Employees(108, 48000.00, "Satwinder", "Gill", "sat@example.com"));
        employeeList.add(new Employees(101, 60000.00, "Maher", "Dhaliwal", "maher@example.com"));



        Collections.sort(employeeList);


        for (Employees emp : employeeList) {
            System.out.println(emp);
        }
    }
}