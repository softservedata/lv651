package HW09.PracticalTask;

import java.util.*;

public class PT2 {
    /*
        In the main() method declare map employeeMap of pairs <Integer, String>.
        Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
        Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
        Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).
    */
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = initMap();
        System.out.println(employeeMap);

        getEmployeeByID(employeeMap);
        getEmployeeByName(employeeMap);
    }

    private static void getEmployeeByID(Map employeeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter map id [1..7] or Exit to break:");
        do {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("exit")) break;

            int n = Integer.parseInt(s);
            if (employeeMap.containsKey(n)) System.out.println(employeeMap.get(n));
            else System.out.println("I'm so sorry! I can't find this ID=" + n);
        } while (true);
    }

    private static void getEmployeeByName(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2");
        System.out.println(map);
        System.out.println("Enter name or Exit to break:");
        do {
            String value = scanner.nextLine();
            if (value.equalsIgnoreCase("exit")) break;

            if (map.containsValue(value)) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(value)) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            } else System.out.println("I'm so sorry! I can't find this ID=" + value);
        } while (true);
    }

    private static Map<Integer, String> initMap() {
        Map<Integer, String> employeeMap = new HashMap();
        employeeMap.put(1, "Steven Seagal");
        employeeMap.put(2, "Arnold Schwarzenegger");
        employeeMap.put(3, "Sylvester Stallone");
        employeeMap.put(4, "Dolph Lundgren");
        employeeMap.put(5, "Jean Claude Van Damme");
        employeeMap.put(6, "Bruce Willis");
        employeeMap.put(7, "Jason Statham");
        return employeeMap;
    }
}
