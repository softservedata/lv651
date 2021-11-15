package com.softserve.edu.hw01;
import java.util.Scanner;


public class HomeWork {

    public static void main(String[] args) {

        System.out.println("Task 1.\n" +
                "Define integer variables a and b. Read values a and b from Console and calculate:\n" +
                "      a + b\n" +
                "      a - b\n" +
                "      a * b\n" +
                "      a / b.");

        System.out.print("Enter number 'a':  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Your number 'a' is equal " + a);

        System.out.print("Enter number 'b':  ");
        int b = sc.nextInt();
        System.out.println("Your number 'b' is equal " + b);

        System.out.println("Sum of these numbers = " + (a + b));
        System.out.println("Difference of these numbers = " + (a - b));
        System.out.println("Product of these numbers = " + (a * b));
        System.out.println("Fraction of these numbers = " + (a / b));


        System.out.println("==================================================================================");
        System.out.println("Task 2.\nOutput question “How are you?“. Define string variable answer.\n" +
                "Read the value answer and output: “You are (answer)\".");
        System.out.println("How are you?");
        String answer = sc.next();
        System.out.println("You are " + answer);


        System.out.println("==================================================================================");
        System.out.println("Task 3.\nCreate console application. In method main() write code for solving next tasks:\n" +
                "Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.");

        float S, P;
        float Pi = 3.14f;
        System.out.print("Enter R:  ");
        float R = sc.nextFloat();
        S = Pi * (R * R);
        P = 2 * Pi * R;
        System.out.println("Your perimeter equal : " + P);
        System.out.println("Your area equal : " + S);

        System.out.println("==================================================================================");

        System.out.println("Task 4.\nDefine String variables name and address. Output question \"What is your name?\" Read the value name and output next question: “Where are you live, (name)?\". Read address and write whole information.\n");

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Where do you live," + name + "?");
        String address = sc.next();
        System.out.println("Your name is " + name + "and you live in " + address);

        System.out.println("==================================================================================");
        System.out.println("Task 5.\n"+"Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? Input all source data from console, make calculations and output to the screen."
);
        float c1 = 2.5f, c2 = 3, c3 = 1.25f;
        float t1, t2, t3;
        float price1, price2, price3, price4;
        System.out.println("Enter spend time talking from country c1: ");
        t1 = sc.nextFloat();

        System.out.println("Enter spend time talking from country c2: ");
        t2 = sc.nextFloat();

        System.out.println("Enter spend time talking from country c3: ");
        t3 = sc.nextFloat();

        price1 = t1 * c1;
        price2 = t2 * c2;
        price3 = t3 * c3;
        price4 = price1 + price2 + price3;

        System.out.println("|Choose 1 to count price for call from country c1-------------|");
        System.out.println("|Choose 2 to count price for call from country c2-------------|");
        System.out.println("|Choose 3 to count price for call from country c3-------------|");
        System.out.println("|Choose 4 to count price for calls from countries c1,c2 and c3|");
        System.out.println("|Choose 5 to end program--------------------------------------|");

        boolean n = true;

        while (n) {
            int m;
            m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Price equal $ " + price1);
                    break;
                case 2:
                    System.out.println("Price equal $ " + price2);
                    break;
                case 3:
                    System.out.println("Price equal $ " + price3);
                    break;
                case 4:
                    System.out.println("Price equal $ " + price4);
                    break;
                case 5:
                    System.out.println("Power off...");
                    n = false;
                    break;
            }
        }
    }
}

