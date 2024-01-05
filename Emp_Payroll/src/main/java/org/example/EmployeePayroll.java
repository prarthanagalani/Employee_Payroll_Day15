package org.example;

import java.io.File;

import java.io.IOException;
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

        // UC2: File Operations
        String fileName = "employee_details.txt";
        File file = new File(fileName); // points to the file if its exist

        try {
            // Check if the file exists
            if (file.exists()) {
                System.out.println("\nFile " + fileName + " exists.");
            } else {
                System.out.println("\nFile " + fileName + " does not exist.");
            }

            // Create directory
            File directory = new File("employee_data");
            if (!directory.exists()) {
                directory.mkdir();
                System.out.println("Directory created: " + directory.getName());
            }

            // Create empty file
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            // List files and directories
            System.out.println("\nList of files and directories:");
            File[] files = new File(".").listFiles();
            for (File fileOrDir : files) {
                System.out.println(fileOrDir.getName());
            }

            // Delete file
            if (file.delete()) {
                System.out.println("\nFile deleted: " + file.getName());
            } else {
                System.out.println("\nFailed to delete file.");
            }

            // Check if the file exists after deletion
            if (file.exists()) {
                System.out.println("File " + fileName + " still exists.");
            } else {
                System.out.println("File " + fileName + " does not exist after deletion.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
