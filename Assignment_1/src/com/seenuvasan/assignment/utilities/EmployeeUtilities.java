package com.seenuvasan.assignment.utilities;

import com.seenuvasan.assignment.employees.Employee;

public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * 
     * @param employee The employee whose details need to be printed.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
