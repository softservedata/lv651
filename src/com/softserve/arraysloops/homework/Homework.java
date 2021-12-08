package com.softserve.arraysloops.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int numMonth = sc.nextInt();

        System.out.println("This amount of days: " + monthDays[--numMonth] + " has this month.");
    }

    public static void task2() {

        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wanna store in array: ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the number to array: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }

        // Check if first half of array contain negative number
        boolean positiveNum = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0) {
                positiveNum = false;
                System.out.println("There are some negative numbers!");
            }
        }

        //Calculate
        if (positiveNum) {
            for (int i = 0; i < arr.length / 2; i++) {
                sum += arr[i];
            }
            System.out.println("The sum of first five elements is:" + sum);
        } else {
            for (int i = arr.length / 2; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("The sum of last five elements is:" + sum);
        }
    }

    public static void task3() {
        int num;
        int minNum = Integer.MAX_VALUE;
        int firstPositive = 0;
        int secondPositive = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wanna store in array: ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the number to array: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (firstPositive == 0) {
                    firstPositive = arr[i];
                } else {
                    secondPositive = arr[i];
                    System.out.println("Second positive: " + secondPositive);
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        System.out.println("This is the minimum number in array: " + minNum);

        int sum = 0;
        int[] arr2 = new int[100];
        System.out.println("Enter the number to array: ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
            if (arr2[j] < 0) {
                System.out.println("Negative number detected.");
                break;
            }
            if (arr2[j] % 2 == 0) {
                sum += arr2[j];
            }
        }
        System.out.println("Your numbers in array: " + Arrays.toString(arr2));
        System.out.println("The sum of all odd nums is: " + sum);
    }

    public static void task4() {
        Car car1 = new Car("Toyota", 2008, 3);
        Car car2 = new Car("Nissan", 2010, 1);
        Car car3 = new Car("Skoda", 1996, 4);
        Car car4 = new Car("Honda", 2020, 2);

        System.out.println("Please enter the year of the car(1996, 2008, 2010, 2020) : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        switch (year) {
            case 2008:
                System.out.println("Car type is: " + car1.getType() + ". Engine capacity is: " +
                        car1.getEngineCapacity() + ".");
                break;
            case 2010:
                System.out.println("Car type is: " + car2.getType() + ". Engine capacity is: " +
                        car2.getEngineCapacity() + ".");
                break;
            case 1996:
                System.out.println("Car type is: " + car3.getType() + ". Engine capacity is: " +
                        car3.getEngineCapacity() + ".");
                break;
            case 2020:
                System.out.println("Car type is: " + car4.getType() + ". Engine capacity is: " +
                        car4.getEngineCapacity() + ".");
                break;
            default:
                System.out.println("Don't have this car in system.");
        }

        Car[] carYear = new Car[]{car1, car2, car3, car4};
        Car yearsCar = null;

        for (int k = 0; k < carYear.length; k++) {
            for (int j = k + 1; j < carYear.length; j++) {
                if (carYear[k].getYearProduction() > carYear[j].getYearProduction()) {
                    yearsCar = carYear[k];
                    carYear[k] = carYear[j];
                    carYear[j] = yearsCar;
                }
            }
        }
        System.out.println();

        System.out.println("Cars ordered by field year : ");
        for (int i = 0; i < carYear.length; i++) {
            System.out.println(carYear[i].getType() + " is this year of production " + carYear[i].getYearProduction() + ".");
        }
    }
}
