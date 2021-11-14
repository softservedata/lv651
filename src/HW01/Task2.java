package HW01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name:");
        String name = br.readLine();
        System.out.print("\nWhere do you live, " + name + "? ");
        String address = br.readLine();

        System.out.println("Your name is " + name + ". You address is:" + address);
    }
}
