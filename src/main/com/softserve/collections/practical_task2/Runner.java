package com.softserve.collections.practical_task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Peter");
        employeeMap.put(102, "Alice");
        employeeMap.put(103, "Kate");
        employeeMap.put(104, "Josh");
        employeeMap.put(105, "Anna");
        employeeMap.put(106, "Yura");
        employeeMap.put(107, "Chris");
        System.out.println("Employee ID and Name:\n" + employeeMap);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the ID number(101,102,103,104,105,106,107): ");
        int id = sc.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("Id is: " + id + "\nBelongs to: " + employeeMap.get(id));
        } else {
            System.out.println("There no this ID.");
        }
        System.out.println("\nPlease enter name: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();

        String userName = null;
        int userid = -1;
        for (Map.Entry<Integer, String> mapEmp : employeeMap.entrySet()) {
            if (mapEmp.getValue().equals(name)) {
                userName = name;
                userid = mapEmp.getKey();
            }
        }

        if (userName != null) {
            System.out.println("User name is: " + userName + "\nUser ID is: " + userid);
        } else {
            System.out.println("User not found.");
        }

    }
}
