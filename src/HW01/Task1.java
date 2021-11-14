package HW01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, input radius:");
        int r = Integer.parseInt(br.readLine());
        System.out.println("Perimeter is:" + String.format(" %.2f",(2*r*Math.PI)));
        System.out.println("Square is   :" + String.format("%.2f",(Math.PI*Math.pow(r,2))));
    }
}
