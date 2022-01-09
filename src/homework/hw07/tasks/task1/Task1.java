package homework.hw07.tasks.task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Unsorted array: ");
        Employee[] employees = {
                new SalariedEmployee(1, "Oksana", 450, 25, 20934857),
                new SalariedEmployee(2, "Bohdan", 430, 25, 23512344),
                new SalariedEmployee(3, "Orest", 350, 20, 34234554),
                new ContractEmployee(4, "Ira", 3457748),
                new ContractEmployee(5, "Anatoliy", 15000, 3462462)
        };

        double averageSalary = 0;
        for (Employee employee : employees) {
            System.out.println(employee);
            averageSalary = averageSalary + employee.calculatePay();
        }

        System.out.println("\nSorted array: ");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nAverage monthly wage: " + averageSalary/employees.length);
    }
}
