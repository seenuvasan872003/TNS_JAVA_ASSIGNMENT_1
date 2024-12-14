package com.assignment.main;

import com.seenuvasan.assignment.employees.Developer;
import com.seenuvasan.assignment.employees.Manager;
import com.seenuvasan.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("John Doe", 101, 75000, 5);
        Developer developer = new Developer("Jane Smith", 102, 60000, "Java");

        // Display details using EmployeeUtilities
        System.out.println("Manager:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper:");
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
