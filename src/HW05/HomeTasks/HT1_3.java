package HW05.HomeTasks;

import java.util.Locale;
import java.util.Scanner;

public class HT1_3 {
    public static void main(String[] args) {
        /*
        read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter HTTP Error number (400...407)");
        do {
            String str = input.nextLine();
            if (str.toUpperCase().equals("EXIT")) {
                break;
            }
            int number = Integer.parseInt(str);
            System.out.println(HTTPError.getDescriptionByErrorNumber(number));
        }while (true);
    }
}
