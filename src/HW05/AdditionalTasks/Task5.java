package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        5.	Ввести числа a, b і c.
        Якщо не можна побудувати трикутник з таким довжинами стрін, то надрукувати 0,
        інакше надрукувати 3, 2, або 1 в залежності від того, рівнсторонній це трикутник,
        рівнобедренний або який-небудь інший
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи сторону a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введи сторону b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Введи сторону c:");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(getTriangleMessage(a, b, c));
        scanner.close();
    }

    private static String getTriangleMessage(int a, int b, int c) {
        int t = getTriangleType(a, b, c);
        String result;
        switch (t) {
            case 0:
                result = " - неможливо побудувати!";
                break;
            case 1:
                result = " - різносторонній!";
                break;
            case 2:
                result = " - рівнобедренний!";
                break;
            case 3:
                result = " - рівносторонній!";
                break;
            default:
                result = " - невідомо";
        }
        return "" + t + result;
    }

    private static int getTriangleType(int a, int b, int c) {
        if ((a + b) > c
         && (a + c) > b
         && (c + b) > a) {
            //трикутрик побудувати можна
            //визначити тип
            if (a == b && b == c && c == a) return 3;
            else if (a == b || b == c || c == a) return 2;
            else return 1;
        } else {
            return 0;
        }
    }
}
