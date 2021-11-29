package homework.hw01;
/*
    Phone calls from three different countries are с1, с2 and с3 standard units per minute.
    Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk
    together? Input all source data from console, make calculations and output to the screen.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw01ex3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of the flower bed: ");
        double c1, c2, c3, t1, t2, t3, pr1, pr2, pr3;
        System.out.println("How much is a minute of a phone call in the country №1? ");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("How long did the phone call (min)? ");
        t1 = Double.parseDouble(br.readLine());
        System.out.println("How much is a minute of a phone call in the country №2? ");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("How long did the phone call (min)? ");
        t2 = Double.parseDouble(br.readLine());
        System.out.println("How much is a minute of a phone call in the country №3? ");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("How long did the phone call (min)? ");
        t3 = Double.parseDouble(br.readLine());
        pr1 = c1*t1;
        pr2 = c2*t2;
        pr3 = c3*t3;
        System.out.println("Computer will count first call for - " + pr1 + ", second call for - " + pr2 + " and third call for - " + pr3 + "\nTogether - " + (pr1+pr2+pr3));
    }
}
