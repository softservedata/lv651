package com.softserve.arraysloops.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Homework homework = new Homework();
        homework.task1();
        homework.task2();
        homework.task3();
        homework.task4();
    }

    public void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int numMonth = sc.nextInt();

        System.out.println("This amount of days: " + daysInMonth(numMonth) + " has this month.");
    }

    public int daysInMonth(int numOfMonth) {
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        return monthDays[--numOfMonth];
    }

    public void task2() {
        int num;
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

        if (detectNegativeNumbers(arr)) {
            System.out.println("Negative numbers detected");
        } else {
            System.out.println("No negative numbers");
        }
        System.out.println("Result of calculation: " + calculate(arr));
    }

    public boolean detectNegativeNumbers(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public int calculate(int[] arr) {
        boolean isNegativeDetected = detectNegativeNumbers(arr);
        int sum = 0;
        if (!isNegativeDetected) {
            for (int i = 0; i < arr.length / 2; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            for (int i = arr.length / 2; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }

    public void task3() {
        int num;
        int minNum = Integer.MAX_VALUE;

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

        System.out.println("Second positive: " + secondPos(arr));

        for (int k : arr) {
            if (minNum > k) {
                minNum = k;
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

    public int secondPos(int[] arr) {
        int positive1 = 0;
        int positive2 = 0;

        for (int j : arr) {
            if (j > 0) {
                if (positive1 == 0) {
                    positive1 = j;
                } else {
                    positive2 = j;
                    break;
                }
            }
        }
        return positive2;
    }

    public void task4() {
        Car car1 = new Car("Toyota", 2008, 3);
        Car car2 = new Car("Nissan", 2010, 1);
        Car car3 = new Car("Skoda", 1996, 4);
        Car car4 = new Car("Honda", 2020, 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year of the car: ");
        Car car = findCarByYear(sc.nextInt());

        System.out.println("This is the car " + car.getType() + " of that year: " + car.getYearProduction());

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
        for (Car value : carYear) {
            System.out.println(value.getType() + " is this year of production " + value.getYearProduction() + ".");
        }
        System.out.println();
    }

    public Car findCarByYear(int year) {
        Car car1 = new Car("Toyota", 2008, 3);
        Car car2 = new Car("Nissan", 2010, 1);
        Car car3 = new Car("Skoda", 1996, 4);
        Car car4 = new Car("Honda", 2020, 2);

        Car[] carsArr = new Car[]{car1, car2, car3, car4};

        for (Car car : carsArr) {
            if (car.getYearProduction() == year) {
                return car;
            }
        }
        return null;
    }

}
