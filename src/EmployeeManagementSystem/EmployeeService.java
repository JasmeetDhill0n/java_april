package EmployeeManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>();
    private final Map<String, Department> departments = new HashMap<>();

    // Add a new department
    public void addDepartment(Department dept) {
        departments.put(dept.getDeptId(), dept);
    }

    // Get department by ID
    public Department getDepartment(String id) {
        return departments.get(id);
    }

    // Register a new employee
    public void registerEmployee(Employee emp) {
        employees.put(emp.getEmpId(), emp);
    }

    // Get employee by ID
    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    // List all employees
    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("---- Employees ----");
            for (Employee e : employees.values()) {
                e.displayDetails();
            }
        }
    }

    // List all departments
    public void listDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            System.out.println("---- Departments ----");
            for (Department d : departments.values()) {
                System.out.println(d);
            }
        }
    }
}


