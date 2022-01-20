package homework.hw11.practicaltasks.task1;

import java.util.Scanner;

public class Task1 {

    public static int squareRectangle(int a, int b) {

        try {
            if (a < 0 || b < 0) throw new Exception("a || b is < 0");
            return a*b;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int c = 0;

        try {
            c = squareRectangle(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }

}
