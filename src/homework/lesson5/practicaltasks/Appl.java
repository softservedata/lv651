package homework.lesson5.practicaltasks;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        //Enter three numbers. Find out how many of them are odd.
        int num1, num2, num3;
        int counter=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        if (num1 % 2 == 1) {
            counter++;
        }
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        if (num2 % 2 == 1) {
            counter++;
        }
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();
        if (num3 % 2 == 1) {
            counter++;
        }
        System.out.println(counter + " of all this numbers is odd.");

        //Enter the number of the day of the week. Display the name in three languages.
        int a;

        System.out.println("Enter the first number for any day of the week: ");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered wrong number");
        }

        System.out.println("Enter the second number for any day of the week: ");
        a = 0;
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered wrong number");
        }

        System.out.println("Enter the third number for any day of the week: ");
        a = 0;
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered wrong number");
        }
    }
}
