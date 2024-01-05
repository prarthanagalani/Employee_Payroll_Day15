package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee details from console
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create an EmployeePayroll object
        EmployeePayroll employee = new EmployeePayroll(id, name, salary);

        List<EmployeePayroll> employeeList = new ArrayList<>();
        employeeList.add(employee);

        // Display employee details
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        scanner.close();
    }
}
