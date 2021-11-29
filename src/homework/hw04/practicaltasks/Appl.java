package homework.hw04.practicaltasks;

import java.util.Locale;
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
                System.out.println("Monday, Понедельник, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Вторник, Вівторок");
                break;
            case 3:
                System.out.println("Wednesday, Среда, Середа");
                break;
            case 4:
                System.out.println("Thursday, Четверг, Четвер");
                break;
            case 5:
                System.out.println("Friday, Пятница, П'ятница");
                break;
            case 6:
                System.out.println("Saturday, Суббота, Субота");
                break;
            case 7:
                System.out.println("Sunday, Воскресенье, Неділя");
                break;
            default:
                System.out.println("Entered wrong number");
        }

        System.out.println("Enter the second number for any day of the week: ");
        a = 0;
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday, Понедельник, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Вторник, Вівторок");
                break;
            case 3:
                System.out.println("Wednesday, Среда, Середа");
                break;
            case 4:
                System.out.println("Thursday, Четверг, Четвер");
                break;
            case 5:
                System.out.println("Friday, Пятница, П'ятница");
                break;
            case 6:
                System.out.println("Saturday, Суббота, Субота");
                break;
            case 7:
                System.out.println("Sunday, Воскресенье, Неділя");
                break;
            default:
                System.out.println("Entered wrong number");
        }

        System.out.println("Enter the third number for any day of the week: ");
        a = 0;
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday, Понедельник, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Вторник, Вівторок");
                break;
            case 3:
                System.out.println("Wednesday, Среда, Середа");
                break;
            case 4:
                System.out.println("Thursday, Четверг, Четвер");
                break;
            case 5:
                System.out.println("Friday, Пятница, П'ятница");
                break;
            case 6:
                System.out.println("Saturday, Суббота, Субота");
                break;
            case 7:
                System.out.println("Sunday, Воскресенье, Неділя");
                break;
            default:
                System.out.println("Entered wrong number");
        }

        //Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
        System.out.println("Enter name of country: ");
        Scanner scs = new Scanner(System.in);
        String country = scs.nextLine();
        switch (country.toUpperCase(Locale.ROOT)) {
            case "FRANCE":
            case "UKRAINE":
            case "GERMANY":
            case "CHINESE":
                System.out.println(country + " is located in " + Continents.EURASIA);
                break;

            case "AUSTRALIA":
                System.out.println(Continents.AUSTRALIA + " is a country with its own continent");
                break;

            case "EGYPT":
            case "RSA":
            case "KENYA":
            case "MADAGASCAR":
                System.out.println(country + " is located in " + Continents.AFRICA);
                break;

            case "ANTARCTICA":
                System.out.println("There are no country in " + Continents.ANTARCTICA);
                break;

            case "USA":
            case "CANADA":
            case "MEXICO":
            case "CUBA":
                System.out.println(country + " is located in " + Continents.NORTH_AMERICA);
                break;

            case "BRAZIL":
            case "ARGENTINA":
            case "COLOMBIA":
            case "PERU":
                System.out.println(country + " is located in " + Continents.SOUTH_AMERICA);
                break;

            default:
                System.out.println("Entered wrong name");
        }
    }
}
