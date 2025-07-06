package July5Map;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    //Employee: empId, firstName, lastName, salary, company
    //
    //map<String, employee>
    //
    //create a map of employee_empId and employee
    //
    //put 5 entries, use put, putifabsent, get, values, keys, entryset

    public static void main(String[] args) {
        Employee employee =new Employee("Jasmeet","Kaur","$100000","Give and Go Company");
        Employee employee1 =new Employee("Samreet","Kaur","$100000","Rogers");
        Employee employee2 =new Employee("Gurjot","Kaur","$100000","Amazon");
        Employee employee3 =new Employee("Arsh","Kaur","$100000","microsoft");
        Employee employee4 =new Employee("Maher","Singh","$100000","Google");

        Map <String,Employee> employeeId =  new HashMap<>();
        employeeId.put("8283",employee);
        employeeId.put("1234",employee1);
        employeeId.put("7894",employee2);
        employeeId.put("4345",employee3);
        employeeId.put("5886",employee4);

        employeeId.putIfAbsent("8283",employee);
        employeeId.putIfAbsent("8283",new Employee("Raman","kaur","$585595","Google"));

        System.out.println(employeeId.get("1234"));


        System.out.println("All employee Value - ");
        for (Employee value : employeeId.values()) {
            System.out.println(value);
        }

        System.out.println("All employee keys - ");
        for(String keys :employeeId.keySet()){
            System.out.println(keys);
        }
        for (Map.Entry<String, Employee> entry : employeeId.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
