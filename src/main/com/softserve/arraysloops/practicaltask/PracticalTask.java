package com.softserve.arraysloops.practicaltask;

import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        practicalTask1();
        practicalTask2();

    }

    public static void practicalTask1() {
        int[] arr = new int[]{-8, -6, -5, -2, 1, 3, 5, 7, 9, 10};
        int biggestInt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggestInt) {
                biggestInt = arr[i];
            }
        }
        System.out.println("This is the biggest int in array: " + biggestInt);
        System.out.println();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        System.out.println("The sum of positive numbers is: " + sum);
        System.out.println();

        int negativeSum = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                negativeSum += arr[j];
            }
        }
        System.out.println("The sum of negative numbers is: " + negativeSum);
        System.out.println();

        int negativeCounter = 0;
        int positiveCounter = 0;

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 0) {
                negativeCounter++;
            }
        }
        System.out.println("The value of negative numbers: " + negativeCounter);
        System.out.println();
        for (int t = 0; t < arr.length; t++) {
            if (arr[t] > 0) {
                positiveCounter++;
            }
        }
        System.out.println("The value of positive numbers is: " + positiveCounter);
        System.out.println();
        if (negativeCounter > positiveCounter) {
            System.out.println("There are more negative numbers in the array!");
        } else {
            System.out.println("There are more positive numbers in the array!");
            System.out.println();
        }

    }

    public static void practicalTask2() { //Employee
        Employee employee1 = new Employee("Bob", 1, 120);
        Employee employee2 = new Employee("Chris", 1, 110);
        Employee employee3 = new Employee("Jack", 2, 180);
        Employee employee4 = new Employee("Josh", 2, 140);
        Employee employee5 = new Employee("Rick", 3, 170);

        Employee[] allEmployee = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        System.out.print("Please enter number of department: ");
        Scanner sc = new Scanner(System.in);
        int depNum = sc.nextInt();

        for (int i = 0; i < allEmployee.length; i++) {
            //System.out.println(allEmployee[i].getDepartmentNumber());
            if (depNum == allEmployee[i].getDepartmentNumber()) {
                System.out.println("This is the person with this department number :" + "\n" + allEmployee[i].getName()
                        + " salary is: " + allEmployee[i].getSalary() + "$.");
                System.out.println();
            }
        }

        Employee[] employeeSalary = new Employee[]{employee1, employee2, employee3, employee4, employee5};
        Employee temp = null;

        for (int k = 0; k < employeeSalary.length; k++) {
            for (int j = k + 1; j < employeeSalary.length; j++) {
                if (employeeSalary[k].getSalary() < employeeSalary[j].getSalary()) {
                    temp = employeeSalary[k];
                    employeeSalary[k] = employeeSalary[j];
                    employeeSalary[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < employeeSalary.length; i++) {
            System.out.println(employeeSalary[i].getSalary() + " ");
        }
    }
}
