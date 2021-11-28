package HW05.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask2 {
    public static void main(String[] args) throws IOException {
        /*
        Enter the number of the day of the week. Display the name in three languages.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of the day of the week (1-7).");
        System.out.println("Type 'Exit' for exit the program.");
        DaysOfWeek[] Days = DaysOfWeek.values();
        do {
            String str = br.readLine();
            if (str.equals("Exit")) {
                break;
            }

            int n = Integer.parseInt(str);
            if (n > 0 && n <= 7) {
                System.out.println(Days[n-1]);
            } else {
                System.out.println("Mistake. Try again.");
            }
        } while (true);
    }
}
