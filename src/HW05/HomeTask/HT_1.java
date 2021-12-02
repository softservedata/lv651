package HW05.HomeTask;

import java.util.Scanner;

public class HT_1 {
    public static void main(String[] args) {
        /*
        Ask user to enter the number of month.
        Read the value and write the amount of days in this month (create array with amount days of each month).
         */
        int[] monses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month. I'll tell how many days it has");
        do {
            String ans = scanner.nextLine();
            if (ans.equals("Exit")) {
                break;
            }
            int numMonth = Integer.parseInt(ans);
            if (numMonth  < 1 || numMonth > 12) {
                System.out.println("Try enter numbers in range [1-12]");
                continue;
            }

            System.out.println("Month № " + numMonth + " has " + monses[numMonth - 1] + " days.");

        } while (true);
    }
}
