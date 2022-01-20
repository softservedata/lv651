package com.softserve.edu.hw05;

import java.util.Scanner;

public class Car {
    private  String type;
    private int year_of_prod;
    private float engine_capacity;


    public Car() {
    }

    public Car(String type, int year_of_prod, float engine_capacity) {
        this.type = type;
        this.year_of_prod = year_of_prod;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear_of_prod(String next) {
        return year_of_prod;
    }

    public void setYear_of_prod(int year_of_prod) {
        this.year_of_prod = year_of_prod;
    }

    public float getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(float engine_capacity) {
        this.engine_capacity = engine_capacity;
    }



    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        Car volkswagen = new Car("Golf VII",2016,1.8F);
        Car volkswagen1 = new Car ("Passat B7", 2020,2.0F );
        Car volkswagen2= new Car ("Arteon", 2018, 2.0F);
        Car volkswagen3 = new Car ("Jetta" , 2005, 1.6F);
        System.out.println("Enter the year of production (2005,2016,2018,2020): ");
        int n;
        n=scan.nextInt();
        switch (n)
        {
            case 2005:
                System.out.println("Type of volkswagen : " + volkswagen3.type + "\nEngine capacity : " + volkswagen3.engine_capacity);
                break;
            case 2016:
                System.out.println("Type of volkswagen : " + volkswagen.type + "\nEngine capacity : " + volkswagen.engine_capacity);
                break;
            case 2018:
                System.out.println("Type of volkswagen : " + volkswagen2.type + "\nEngine capacity : " + volkswagen2.engine_capacity);
                break;
            case 2020:
                System.out.println("Type of volkswagen : " + volkswagen1.type + "\nEngine capacity : " + volkswagen1.engine_capacity);
                break;
        }
        System.out.println("Sorted cars by year: ");
        Car[] arr = {volkswagen, volkswagen1, volkswagen2, volkswagen3};
        Car tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].year_of_prod < arr[j].year_of_prod) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

    }

}

class Array {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       /*
       int [] monthDays1 =  {31}; // січень
       int [] monthDays2 =  {28}; // лютий
       int [] monthDays3 =  {31}; // березнь
       int [] monthDays4 =  {30}; // квітень
       int [] monthDays5 =  {31}; // травень
       int [] monthDays6 =  {30}; // червень
       int [] monthDays7 =  {31}; // липень
       int [] monthDays8 =  {31}; // серпень
       int [] monthDays9 =  {30}; // вересень
       int [] monthDays10 =  {31}; // жовтень
       int [] monthDays11 =  {30}; // листопад
       int [] monthDays12 =  {31}; // грудень
        System.out.println("Enter the number of month: ");
        boolean n = true;
        while (n) {
            int m;
            m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("January - " + monthDays1[0] + " days");
                    break;
                case 2:
                    System.out.println("February - " + monthDays2[0] + " days");
                    break;
                case 3:
                    System.out.println("March - " + monthDays3[0] + " days");
                    break;
                case 4:
                    System.out.println("April - " + monthDays4[0] + " days");
                    break;
                case 5:
                    System.out.println("May - " + monthDays5[0] + " days");
                    break;
                case 6:
                    System.out.println("June - " + monthDays6[0] + " days");
                    break;
                case 7:
                    System.out.println("July - " + monthDays7[0] + " days");
                    break;
                case 8:
                    System.out.println("August - " + monthDays8[0] + " days");
                    break;
                case 9:
                    System.out.println("September - " + monthDays9[0] + " days");
                    break;
                case 10:
                    System.out.println("October - " + monthDays10[0] + " days");
                    break;
                case 11:
                    System.out.println("November - " + monthDays11[0] + " days");
                    break;
                case 12:
                    System.out.println("December - " + monthDays12[0] + " days");
                    break;
                case 13:
                    n=false;
                    System.out.println("Ending...");
                    break;
            }
        }*/
        /*
        System.out.println("Enter numbers of array: ");
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Your array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + myArray[i]);
        }
        int count = 0, sum = 0, product = 1;
        for (int i = 0; i < 10; i++) {
            if (myArray[i] > 0) {
                count++;
            }
        }
        if (count == 10) {
            for (int i = 0; i < 5; i++) {
                sum = sum + myArray[i];
            }
        } else {
            for (int i = 5; i < 10; i++) {
                product = product * myArray[i];
            }
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
    }
}*/

        System.out.println("Enter numbers of array: ");
        int[] arr = new int[5];
        int k;
        int product = 1;
        for (int i = 0; i < 5; i++) {
            k = sc.nextInt();
            if(k < 0){
                System.out.println("Product equal: " + product);
                System.exit(1);
                break;
            }
            else {
                arr[i] = k;
                if(arr[i]%2==0){
                    product = product * arr[i];
                }
            }
        }


        System.out.println("Your array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
        int count = 0, a = 0, ia = 0;
        for (int i = 0; count < 2; i++) {
            if (arr[i] > 0) {
                count++;
                a = arr[i];
                ia = i;
            }

        }
        System.out.println("\nSecond pos num is - " + a + " it's pos is - " + (ia + 1));
        int min = arr[0];
        int imin = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        System.out.println("\nMin element is - " + min + " it's position is " + (imin + 1));

    }
}
