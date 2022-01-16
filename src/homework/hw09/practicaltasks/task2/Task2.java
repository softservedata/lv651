package homework.hw09.practicaltasks.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(0, "Oksana"); employeeMap.put(1, "Oleh"); employeeMap.put(2, "Bohdan"); employeeMap.put(3, "Anton");
        employeeMap.put(4, "Sofia"); employeeMap.put(5, "Max"); employeeMap.put(6, "Anna");

        System.out.print("Enter ID: ");
        int id = new Scanner(System.in).nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("ID: " + id + ", name: " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with ID: " + id);
        }

        System.out.print("\nEnter name: ");
        String name = new Scanner(System.in).nextLine();
        int temp = -1;
        if (employeeMap.containsValue(name)) {
            for (Integer key: employeeMap.keySet()) {
                if (employeeMap.get(key).equals(name)) temp = key;
            }
            System.out.println("ID: " + temp + ", name: " + name);
        } else {
            System.out.println("There is no employee with name: " + name);
        }

    }
}
