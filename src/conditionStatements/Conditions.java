package conditionStatements;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        oddNums(); //Practical task#1
        daysOfTheWeek(); //Practical task#2
        countryContinents();//Practical task#3
        productsInfo();//Practical task#4
        dogs();//Homework#2
        floatNum();//Homework#1 part1
        intNum(); //Homework#1 part2
        httpError();//Homework#1 part3

    }

    public static void oddNums() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println("This number is ood: " + a);
        }
        if (b % 2 != 0) {
            System.out.println("This number is odd: " + b);
        }
        if (c % 2 != 0) {
            System.out.println("This number is ood: " + c);
        }
    }

    public static void daysOfTheWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the day of the week :");
        String day = sc.nextLine();
        day = day.toUpperCase();

        switch (day) {
            case "MONDAY":
                System.out.println("MONDAY in three lang is: \nRus: понедельник\nIt: lunedì\nSp: lunes");
                break;
            case "TUESDAY":
                System.out.println("TUESDAY in three lang is: \nRus: вторник\nIt: Martedì\nSp: martes");
                break;
            case "WEDNESDAY":
                System.out.println("WEDNESDAY in three lang is: \nRus: среда\nIt: mercoledì\nSp: \n" +
                        "miércoles");
            case "THURSDAY":
                System.out.println("THURSDAY in three lang is: \nRus: четверг\nIt: giovedi\nSp: jueves");
                break;
            case "FRIDAY":
                System.out.println("FRIDAY in three lang is: \nRus: пятница\nIt: venerdì\nSp: viernes");
                break;
            case "SATURDAY":
                System.out.println("SATURDAY in three lang is: \nRus: суббота\nIt: \n" +
                        "il sabato\nSp: sábado");
                break;
            case "SUNDAY":
                System.out.println("SUNDAY in three lang is: \nRus: воскресене\nIt: Domenica\nSp: domingo");
                break;
            default:
                System.out.println("Error! Enter again day of the week, please: ");
                day = sc.nextLine();
        }
    }

    public static void countryContinents() {
        Country.findContinent(); // Practical task #
        System.out.println();
        System.out.println();
    }

    public static void productsInfo() {
        //Practical task#4
        Product product1 = new Product("Banana", 9, 5);
        Product product2 = new Product("Avocado", 20, 3);
        Product product3 = new Product("Apple", 10, 8);
        Product product4 = new Product("Orange", 8, 4);


        Product mostExpensiveProduct = product1;
        if (product2.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product2;
        }
        if (product3.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product3;
        }
        if (product4.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product4;
        }
        System.out.println("This product is the most expensive: " + mostExpensiveProduct.getName()
                + " " + mostExpensiveProduct.getPrice() + "$.");


        Product biggestQuantity = product1;
        if (product2.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product2;
        }
        if (product3.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product3;
        }
        if (product4.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product4;
        }
        System.out.println("This product has the biggest quantity: " + biggestQuantity.getName()
                + " #" + biggestQuantity.getQuantity() + ".");
        System.out.println();
        System.out.println();
    }

    public static void dogs() {
        //Homework #1
        Dog dog1 = new Dog("Fila", "Boxer", 6);
        Dog dog2 = new Dog("Fluffy", "Puddle", 3);
        Dog dog3 = new Dog("Choppy", "Beagle", 4);

        if (!dog1.equals(dog2) && !dog2.equals(dog3) && !dog3.equals(dog1)) {
            System.out.println("There are no dogs with same names!");
        } else {
            System.out.println("Some dogs have same names!");
        }

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog is " + oldestDog.getAge() + " years old and name is " + oldestDog.getName());
    }

    public static void floatNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first float number: ");
        float a = sc.nextFloat();
        System.out.println("Please enter second float number: ");
        float b = sc.nextFloat();
        System.out.println("Please enter third float number: ");
        float c = sc.nextFloat();

        if (a >= -5 && a <= 5) {
            System.out.println("Number " + a + " belongs to the range [-5,5]");
        } else {
            System.out.println("Number " + a + " doesnt belong to the range [-5,5]");
        }

        if (b >= -5 && b <= 5) {
            System.out.println("Number " + b + " belongs to the range [-5,5]");
        } else {
            System.out.println("Number " + b + " doesnt belong to the range [-5,5]");
        }

        if (c >= -5 && c <= 5) {
            System.out.println("Number " + c + " belongs to the range [-5,5]");
        } else {
            System.out.println("Number " + c + " doesnt belong to the range [-5,5]");
        }
    }

    public static void intNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first integer number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second integer number: ");
        int b = sc.nextInt();
        System.out.println("Please enter third integer number: ");
        int c = sc.nextInt();

        int min = a;
        int max = a;

        if (b < a) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The min integer number is: " + min + ".");
        System.out.println();
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The max integer number is: " + max + ".");
    }

    public static void httpError() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of HTTP ERROR from 400 to 405: ");
        int error = sc.nextInt();


        switch (error) {
            case 400:
                System.out.println("This error number " + error + " is: " + Error.BAD_REQUEST);
                break;
            case 401:
                System.out.println("This error number " + error + " is: " + Error.UNAUTHARIZED);
                break;
            case 402:
                System.out.println("This error number " + error + " is: " + Error.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println("This error number " + error + " is: " + Error.FORBIDDEN);
                break;
            case 404:
                System.out.println("This error number " + error + " is: " + Error.NOT_FOUND);
                break;
            case 405:
                System.out.println("This error number " + error + " is: " + Error.METHOD_NOT_ALLOWED);
                break;
            default:
                System.out.println("NOT FOUND");
        }
    }


}
