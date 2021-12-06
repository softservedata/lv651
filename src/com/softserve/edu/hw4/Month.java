package com.softserve.edu.hw4;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        System.out.println("Enter number of month: ");

        int n = sc.nextInt();

        //[n-1]- calculate correct number of month
        System.out.println(monthName[n-1] + " has " + days[n-1] + " days");
    }
}