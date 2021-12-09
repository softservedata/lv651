package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        10.
        Задано натуральне число n , дійсні числа r : a1....an (n>=2)
        Порахувати скільки серед точок   таких, які належать кругу радіуса   з центром у початку координат
        */
        int r = 5;
        int[] arr = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x = arr[i];
            y = arr[(n - 1) - i];
            System.out.println("Точка x,y (" + x + " , " + y + ") " + isPointBelongsCircle(x, y, r));

        }
    }
    //Належність до кола: якщо гіпотенуза > радіуса - не належить
    //                    якщо гіпотенуза <= радіуса - належить
    private static String isPointBelongsCircle(int x, int y, int r) {
        double hypotenuse = Math.sqrt(x * x + y * y);
        if (hypotenuse <= r) return "належить";
        else return "не належить";
    }
}
