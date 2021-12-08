package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        8.	Обчислити с – найбільший спільний дільник заданих натуральних чисел a і b;
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть два натуральних числа");
        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        int nsd = a;
        System.out.println("Найбільший спільний дільник: " + nsd );

    }
}
