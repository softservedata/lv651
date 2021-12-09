package HW04.HomeTasks;

import java.util.Scanner;

public class HT1_2 {
    public static void main(String[] args) {
        /*
        read 3 integer numbers and write max and min of them;
        */
        Scanner input = new Scanner(System.in);
        int number, max = 0, min = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter int number " + (i + 1) + ":");
            number = Integer.parseInt(input.nextLine());
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min number is:" + min);
        System.out.println("max number is:" + max);
        input.close();
    }
}
