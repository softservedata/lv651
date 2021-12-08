package com.Array.Loops.homework.Cars;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars [0] = new Car(1998, 2);
        cars [1] = new Car(2001,2.1);
        cars [2] = new Car(2004,2.8);
        cars [3] = new Car(2009, 4.0);
        System.out.println(Arrays.toString(cars));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which one car would you like? \nEnter the year of prodaction: ");
        int a = scanner.nextInt();
        if (a == 1998){
            System.out.println("You bought "+ cars[0]);
        } else if (a == 2001){
            System.out.println("You bought "+ cars[1]);
        } else if (a == 2004){
            System.out.println("You bought "+ cars[2]);
        }else if (a==2009){
            System.out.println("You bought "+ cars[3]);
        }else {
            System.out.println("We don`t have any car from that year...");
        }
    }
}
