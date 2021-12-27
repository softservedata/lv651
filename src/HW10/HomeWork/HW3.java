package HW10.HomeWork;

import java.util.Scanner;

public class HW3 {
    /*
    Implement a pattern for US currency: the first symbol "$", then any number of digits,
    dot and two digits after the dot. Enter the text from the console that contains several occurrences of US currency.
    Display all occurrences on the screen.
    */
    public static void main(String[] args) {
        float sum1 = 20.99f;
        //System.out.printf("Sum : \u20B4 %.2f\n", sum1);           //UAG.
        //System.out.printf("Sum : \u0024 %.2f\n", sum1);             //USD
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some sum. (or 'exit')");
        do{
            String result = scanner.nextLine();
            if (result.equalsIgnoreCase("exit") || result.isEmpty()) break;
            result = result.replaceAll("[^0-9|^\\.]+","");          //Delete all non-digit symbols except dot
            float sum = Float.parseFloat(result);
            System.out.printf("Sum : \u0024 %.2f\n", sum);
        }while (true);
    }
}
