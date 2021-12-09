package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*1.	За введеним натуральним числом y - номером деякого року нашої ери,
                обчислити c – номер його століття (врахувати, що, наприклад, початком ХХ століття був 1901, а не 1900 рік)
                та вивести на екран
        */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the year [0..9999]:");
            String nextLine = scanner.nextLine();
            if (nextLine.equalsIgnoreCase("exit")) break;
            int y = Integer.parseInt(nextLine);
            System.out.println("Century :" + getСentury(y));
        } while (true);
        scanner.close();
    }

    private static int getСentury(int y) {
        int i = y / 100;
        if (y % 100 == 0) return i;
        else return ++i;
    }
}
