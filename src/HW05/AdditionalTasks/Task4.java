package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть натуральне число ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Введіть " + n + " дійсні числа: ");
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("" + (i + 1) + ":");
            arr[i] = Double.parseDouble(scanner.nextLine());
        }
        double elem = 0;
        for (int i = 0; i < n; i++) {
            elem = elem + arr[i];
            System.out.printf("%.1f  ", elem);
        }
        scanner.close();
    }
}
