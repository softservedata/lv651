package com.lect7.oop2.homeworks.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        Employee[] employers = new Employee[]{
                new ContractEmployee(3, "Yurii"),
                new SalaryEmployee(1, "Alex", 8),
                new SalaryEmployee(2, "Masha", 6),
                new ContractEmployee(4, "Alina"),
        };

        Arrays.sort(employers, new EmploeeSorting());


        for (Object empl : employers) {
            System.out.println(empl);
        }

    }
}
