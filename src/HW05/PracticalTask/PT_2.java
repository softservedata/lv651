package HW05.PracticalTask;

import java.util.Arrays;
import java.util.Scanner;

public class PT_2 {
    public static void main(String[] args) {
        /*Create a class Employee with fields name, department number, salary.
            Create five objects of class Employee. Display
            all employees of a certain department (enter department number in the console);
            arrange workers by the field salary in descending order
        */
        Employee[] company = new Employee[5];
        for (int i = 0; i < 5; i++) {
            company[i] = new Employee("Worker_" + (i + 1), i + 1, (i + 1) * 100 + i * i);
        }
        company[0].setDepartmentNumber(4);
        printEmployee(company);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department number[1-5] or Exit to close the program:");
        do {
            String ans = scanner.nextLine();
            if (ans.equals("Exit")) {
                break;
            }
            int dep = Integer.parseInt(ans);
            printEmployeeByDep(company, dep);

        } while (true);
        sortBySalaryDesc(company);
        System.out.println("Print employee after sorting.");
        printEmployee(company);
        scanner.close();
    }

    private static void printEmployee(Employee[] company) {
        for (Employee empl : company) {
            System.out.println(empl);
        }

    }

    private static void printEmployeeByDep(Employee[] company, int depNum) {
        boolean founded = false;
        for (Employee empl : company) {
            if (empl.getDepartmentNumber() == depNum) {
                System.out.println(empl);
                founded = true;
            }
        }
        if (!founded) {
            System.out.println("There is no employees in such department");
        }
    }

    private static void sortBySalaryDesc(Employee[] company) {
        Employee tmp;
        for (int j = company.length; j > 1; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (company[i].getSalary() < company[i + 1].getSalary()) {
                    tmp = company[i + 1];
                    company[i + 1] = company[i];
                    company[i] = tmp;
                }
            }
        }
    }
}
