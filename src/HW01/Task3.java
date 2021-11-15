package HW01;

/*
Phone calls from three different countries are с1, с2 and с3 standard units per minute.
Talks continued t1, t2 and t3 minutes.
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input call price from country 1 to country   2:");
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("Input call duration for country 1 to country 2:");
        int t1 = Integer.parseInt(br.readLine());
        int v1 = c1 * t1;

        System.out.print("Input call price from country 2 to country   3:");
        int c2 = Integer.parseInt(br.readLine());
        System.out.print("Input call duration for country 2 to country 3:");
        int t2 = Integer.parseInt(br.readLine());
        int v2 = c2 * t2;

        System.out.print("Input call price from country 1 to country   3:");
        int c3 = Integer.parseInt(br.readLine());
        System.out.print("Input call duration for country 1 to country 3:");
        int t3 = Integer.parseInt(br.readLine());
        int v3 = c3 * t3;

        System.out.println("Call from country 1 to country 2 cost:" + v1);
        System.out.println("Call from country 1 to country 2 cost:" + v2);
        System.out.println("Call from country 1 to country 2 cost:" + v3);
        System.out.println("Cost of all calls is:" + (v1 + v2 + v3));

    }
}
