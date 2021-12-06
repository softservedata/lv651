package com.softserve.edu.hw04;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]) {

        //Task 1
        System.out.println("Task 1.");
        System.out.println("Enter tree numbers: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        if(num1<5.1 && num1>-5.1){
            System.out.println(num1 + " fits");
        }
        else {
            System.out.println(num1 + " isn't in between [-5;5]");
        }

        if(num2<5.1 && num2>-5.1){
            System.out.println(num2 + " fits");
        }
        else {
            System.out.println(num2 + " isn't in between [-5;5]");
        }
        if(num3<5.1 && num3>-5.1){
            System.out.println(num3 + " fits");
        }
        else {
            System.out.println(num3 + " isn't in between [-5;5]");
        }
        //Task 2
        System.out.println("Task 2.");
        int numb1,numb2,numb3;
        System.out.println("Enter tree integer numbers: ");
         numb1 = sc.nextInt();
         numb2 = sc.nextInt();
         numb3 = sc.nextInt();
        int max = 0;
        int min = 0;
        if(numb1>numb2 && numb1>numb3)
            max = numb1;
        if (numb2>numb3 && numb2>numb1)
            max = numb2;
        if (numb3>numb1 && numb3>numb2)
            max=numb3;
        if(numb1<numb2 && numb1<numb3)
        min = numb1;
        if(numb2<numb1 && numb2<numb3)
            min=numb2;
        if(numb3<numb2 && numb3<numb1)
            min=numb3;

        System.out.println("Max " + max);
        System.out.println("Min " + min);


        //Task 3
        System.out.println("Task 3.");
        System.out.println("Enter code of error (400-404)");
        HTTPError error;
        int n=0;
        n = sc.nextInt() ;
        switch (n)
        {
            case 400: error = HTTPError.ERROR_400;
            System.out.println("Bad Request");
            break;
            case 401: error= HTTPError.ERROR_401;
                System.out.println("Unauthorized");
            break;
            case 402: error=HTTPError.ERROR_402;
                System.out.println("Payment Required");
            break;
            case 403: error=HTTPError.ERROR_403;
                System.out.println("Forbidden");
            break;
            case 404: error=HTTPError.ERROR_404;
                System.out.println("Not Found");
                break;
        }
    }
    public enum HTTPError
    {
        ERROR_400("Bar Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found");
        private String name;
        private HTTPError(String name)
        {
            this.name=name;
        }
        }
    }



