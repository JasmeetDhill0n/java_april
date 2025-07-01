package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person implements Rateable {
    private final String empId;
    private final Department department;
    private final List<Integer> ratings = new ArrayList<>();

    public Employee(String name, int age, String empId, Department department) {
        super(name, age);  // Call Person constructor
        this.empId = empId;
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void display() {

    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Age: " + age + ", Department: " + department);
    }

    @Override
    public void addRating(int score) {
        if (score >= 1 && score <= 5) {
            ratings.add(score);
            System.out.println("✅ Rating added.");
        } else {
            System.out.println("❌ Rating must be between 1 and 5.");
        }
    }

    @Override
    public void showPerformance() {
        if (ratings.isEmpty()) {
            System.out.println("No ratings yet.");
        } else {
            double average = ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Average Rating: " + average + " (" + ratings.size() + " ratings)");
        }
    }
}
