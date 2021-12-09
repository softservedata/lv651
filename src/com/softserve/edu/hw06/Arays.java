package com.software.edu.hw06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Arays {
    public static void main(String[] args) throws IOException {
        System.out.println("Homework 6");
        System.out.println("Practical task");
        System.out.println("Task 1");
        Array();
        System.out.println("\nHomework\nTask №1 ");
        numberOfMonth();
        System.out.println("Task №2 ");
        calculateTheSum();
        System.out.println("Task №3 ");
        fiveInteger();

    }

    public static void Array() throws IOException{
        int sum = 0, biggest = 0;
        Integer[] arr;

        Random random = new Random();
        arr = new Integer[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i< arr.length; i++){
            int x = random.nextInt(20) - 9;
            arr[i]=x;
        }

        int Max = arr[0];
        System.out.println("Array is "+java.util.Arrays.toString(arr));
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > Max) {
                Max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Max is "+ Max);

        for(i = 0; i < arr.length; i++){
            if(arr[i]>0) {
                sum += arr[i];
            }
        }
        System.out.println("\nThe sum of positive numbers in the array is "+sum);

        int pos =0, neg = 0;
        for(i = 0; i < arr.length; i++){
            if(arr[i]>0) {
                pos++;
            }
            else neg++;
        }
        if (pos > neg){
            System.out.println("\nPositive: "+pos+"\nNegative: "+neg+ "\nMore the positive numbers");
        }
        else if (neg > pos){
            System.out.println("\nPositive: "+pos+"\nNegative: "+neg+ "\nMore negative numbers");
        }
        else {
            System.out.println("\nPositive: "+pos+"\nNegative: "+neg+ "\nPositive and negative numbers are equal");
        }

   }

   public static void numberOfMonth() throws IOException{
        int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of month: ");
        int num = Integer.parseInt(br.readLine());
        int i = num -1;
        System.out.println("In this month "+month[i]+" days.");

   }

   public static void calculateTheSum() throws IOException{
        Integer[] arr;
        double prod = 1, sum = 0;

        arr = new Integer[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i < arr.length;i++){
            System.out.print("Enter number_"+i+" :");
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
        }
       boolean isNeg = false;
       for (int i = 0; i < arr.length / 2; i++) {
           if (arr[i] < 0) {
               isNeg = true;
               break;
           }
       }
           if (!isNeg) {
               for (int j = 0; j < arr.length / 2; j++) {
                   sum += arr[j];
               }
               System.out.println("Sum = "+sum);
           } else {
               for (int k = arr.length/2; k < arr.length; k++) {
                   prod *= arr[k];
               }
                   System.out.println("Prod = "+ prod);
               }
           }
   public static void fiveInteger() throws IOException{
        Integer[]arr;
        arr = new Integer[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter number №"+i+" : ");
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
        }
        boolean pos = false;
        for (int i = 0; i < arr.length;i++){
            if(arr[i] > 0 && pos){
                System.out.println("The 2n positive number is there : "+ i);
                break;
            }
            else {
                if(arr[i]>0){
                    pos = true;

                }
            }
        }
    }


}

