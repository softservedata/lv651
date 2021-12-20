package com.softserve.edu.hw05;

import org.omg.Messaging.SyncScopeHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Task 1.");
       int [] monthDays1 =  {31}; //січень
       int [] monthDays2 =  {28}; // лютий
       int [] monthDays3 =  {31}; // березнь
       int [] monthDays4 =  {30}; // квітень
       int [] monthDays5 =  {31}; // травень
       int [] monthDays6 =  {30}; // червень
       int [] monthDays7 =  {31}; // липень
       int [] monthDays8 =  {31}; // серпень
       int [] monthDays9 =  {30}; //вересень
       int [] monthDays10 =  {31}; // жовтень
       int [] monthDays11 =  {30}; //листопад
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
        /*System.out.println("Task 2.");
        System.out.println("Enter numbers of array: ");
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Your array:");
        for(int i=0; i<10;i++)
        {
            System.out.print(" " + myArray[i]);
        }
        int count =0, sum=0, product = 1;
         for(int i =0; i<10; i++)
         {
            if(myArray[i]> 0){
                count++;
            }
         }
         if (count==10) {
             for (int i = 0; i < 5; i++) {
                 sum = sum + myArray[i];
             }
         }else
         {
             for(int i =5; i<10; i++)
             {
                 product = product * myArray[i];
             }
         }
        System.out.println("\nSum = " + sum );
        System.out.println("Product = " + product);

         */
        System.out.println("Task 3.");

        System.out.println("Enter numbers of array: ");
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {

                arr[i] = sc.nextInt();

        }
        System.out.println("Your array:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    int count =0, a=0,ia=0;
        for (int i =0 ; count < 2; i++)
        {
            if(arr[i]> 0 )
            {
                count++;
                a=arr[i];
                ia = i;
            }
        }
        System.out.println("\nSecond pos num is - " + a + " it's pos is - " + (ia+1));
        int min = arr[0];
        int imin=0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                imin = i;
            }
        }
        System.out.println("\nMin element is - " + min + " it's position is " + (imin +1));
    }
}
