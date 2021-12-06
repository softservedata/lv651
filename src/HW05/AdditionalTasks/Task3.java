package HW05.AdditionalTasks;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*3.	Обчислити...*/
        double sum = 0;

        int[] b = new int[30];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }

        //int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            sum = sum + getExpr(i+1, b[i]);
        }
        System.out.println("Sum = " + sum);
    }

    private static double getExpr(int i, double b) {
        double a = i % 2 == 0 ? i / 2 : i;
        return Math.pow((a-b),2);
    }
}
