package com.softserve.edu.homework4;

import java.util.Scanner;

public class CarManager {
    public static void main(String[] args) {

        Car nissan = new Car("Nissan GTR",2008,3.8);
        Car toyota = new Car("Toyota Supra",2002,2.9);
        Car mclaren = new Car("McLaren Senna",2018,4.0);
        Car lexus = new Car("Lexus LFA",2013,4.8);
        Car honda = new Car("Honda NSX", 1990, 3.0);

        Car[] arr = {toyota, nissan, lexus, mclaren};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of production (Available only 2002, 2008, 2013, 2018): ");
        int numYer = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            Car ell = arr[i];
            if (ell.yerOfProduction == numYer) {
                System.out.println(ell);
            }
        }

        /*if (numYer == toyota.yerOfProduction) {
            System.out.println(arr[0]);
        } else if (numYer == nissan.yerOfProduction) {
            System.out.println(arr[1]);
        } else if (numYer == lexus.yerOfProduction) {
            System.out.println(arr[2]);
        } else if (numYer == mclaren.yerOfProduction) {
            System.out.println(arr[3]);
        } else {
            System.out.println("!Not in the database!");
        } Math.max()*/

        /*if (numYer == 2002) {
            System.out.println(arr[0]);
        } else if (numYer == 2008) {
            System.out.println(arr[1]);
        } else if (numYer == 2013) {
            System.out.println(arr[2]);
        } else if (numYer == 2018) {
            System.out.println(arr[3]);
        } else {
            System.out.println("!Not in the database!");
        }*/
    }
}
