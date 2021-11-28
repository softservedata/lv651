package HW05.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask1 {
    public static void main(String[] args) throws IOException {
        /*
        Enter three numbers. Find out how many of them are odd.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter some numbers. I'll count odd.");
        System.out.println("Type 'Exit' for exit the program.");
        int sumOdd = 0;
        int sumEven = 0;
        int countNum = 0;
        do {
            String str = br.readLine();
            if (str.equals("Exit")) {
                break;
            }
            countNum++;
            int n = Integer.parseInt(str);

            if (n % 2 == 0) {
                sumEven = sumEven + n;
            } else {
                sumOdd = sumOdd + n;
            }
        } while (true);
        System.out.println("Count of numbers     : " + countNum);
        System.out.println("Sum of odd numbers   : " + sumOdd);
        System.out.println("Count of even numbers: " + sumEven);
        System.out.println();
    }
}
