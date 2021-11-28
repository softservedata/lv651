package HW05.HomeTasks;

import java.util.Scanner;

public class HT1_1 {
    public static void main(String[] args) {
        /*
        read 3 float numbers and check: are they all belong to the range [-5,5];
        */
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter float number " + (i + 1) + ":");
            float fl = Float.parseFloat(input.nextLine());
            if (fl >= -5 && fl <= 5) {
                System.out.println("belong to the range [-5,5]");
            } else {
                System.out.println(" out of range");
            }

        }
    }
}
