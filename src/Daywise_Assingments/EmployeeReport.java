package Daywise_Assingments;

public class EmployeeReport {

    public static void main(String[] args) {
        // Employee details
        String employeeName = "Priya Sharma";
        int employeeId = 10245;
        String department = "Quality Assurance";
        double salary = 85000.50;
        boolean isActive = true;

        String line = "=".repeat(40);

        // Print report
        System.out.println(line);
        System.out.println("           EMPLOYEE REPORT");
        System.out.println(line);
        System.out.printf("%-15s : %s%n", "Name", employeeName);
        System.out.printf("%-15s : %d%n", "Employee ID", employeeId);
        System.out.printf("%-15s : %s%n", "Department", department);
        System.out.printf("%-15s : %,.2f%n", "Salary", salary);
        System.out.printf("%-15s : %s%n", "Status", isActive ? "Active" : "Inactive");
        System.out.println(line);
    }
}

