package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task9 {
    /*9.	Обчислити значення виразу y=cos(1+cos(2+…+cos(39+cos40)…)).*/
    public static void main(String[] args) {
        int count = 5;
        double y = getCos(count);
        System.out.println("y = " + y);
    }

    private static double getCos(int n) {
        double cos=n;
        for (int i = n; i > 1; i--) {
            cos = (i-1) + Math.cos(cos);
        }
        return cos;
    }

}
