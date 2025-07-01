package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        // Add some default departments
        service.addDepartment(new Department("D101", "IT"));
        service.addDepartment(new Department("D102", "HR"));

        boolean running = true;

        while (running) {
            try {
                System.out.println("\n========= MENU =========");
                System.out.println("1. List Employees");
                System.out.println("2. List Departments");
                System.out.println("3. Register Employee");
                System.out.println("4. Add Performance Rating");
                System.out.println("5. Show Employee Performance");
                System.out.println("6. Exit");
                System.out.print("Select option: ");

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        service.listEmployees();
                        break;

                    case 2:
                        service.listDepartments();
                        break;

                    case 3:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Employee ID: ");
                        String empId = sc.nextLine();

                        service.listDepartments();
                        System.out.print("Enter Department ID: ");
                        String deptId = sc.nextLine();

                        Department dept = service.getDepartment(deptId);

                        if (dept != null) {
                            Employee emp = new Employee(name, age, empId, dept);
                            service.registerEmployee(emp);
                            System.out.println("✅ Employee registered.");
                        } else {
                            System.out.println("❌ Department not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Employee ID: ");
                        String empRatingId = sc.nextLine();
                        Employee empRating = service.getEmployee(empRatingId);

                        if (empRating != null) {
                            System.out.print("Enter rating (1 to 5): ");
                            int score = Integer.parseInt(sc.nextLine());
                            empRating.addRating(score);
                        } else {
                            System.out.println("❌ Employee not found.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Employee ID: ");
                        Employee empPerf = service.getEmployee(sc.nextLine());

                        if (empPerf != null) {
                            empPerf.showPerformance();
                        } else {
                            System.out.println("❌ Employee not found.");
                        }
                        break;

                    case 6:
                        running = false;
                        System.out.println("👋 Exiting system. Goodbye!");
                        break;

                    default:
                        System.out.println("❌ Invalid choice.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}

