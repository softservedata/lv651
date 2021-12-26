package com.softserve.edu.hw07.task1;

import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {

        Employee [] employees = new Employee[4];
        employees [0] = new ContractEmployee("1",5000);
        employees[1] = new SalariedEmployee("2", 200,8);
        employees[2] = new SalariedEmployee("3", 300,7);
        employees[3] = new SalariedEmployee("4", 400,9);


        Arrays.sort(employees, Collections.reverseOrder());
        for (Employee employee : employees)
            System.out.println("Sorted Employees: " + employee);


    }
}
