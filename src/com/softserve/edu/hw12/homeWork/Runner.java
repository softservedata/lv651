package com.software.edu.hw12.homeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Runner {

    private static void div(double num1, double num2){
        double res = num1/num2;
        System.out.printf("Result of diving is: %.2f", res);
        System.out.println("\n");
    }




    private static void readNumber(int num){
        int start = 1;
        int end = 100;
        if(num >= start && num <= end){
            System.out.println(num);
        }


    }







    public static void main(String[] args) {

        // method div()

        List<Integer> arr = new ArrayList<Integer>();
        double num1 = 0;
        double num2 = 0;

        int start = 1;
        int end = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Please input first double number: ");
            num1 = Double.parseDouble(br.readLine()) ;
            System.out.print("Please input second double number: ");
            num2 = Double.parseDouble(br.readLine());
        }catch (IOException| NumberFormatException e){
            System.err.println(e.getMessage());
        }
        div(num1,num2);



        // method readNumber()
        int check = 1;

        try{
            for (int i = 0; i<10;i++) {

                System.out.print("Please, enter "+check+" number: ");
                int num = Integer.parseInt(br.readLine());
                if(num > 1 && num < 100) {
                    arr.add(num);
                }

                check++;
                readNumber(num);

            }
        }catch (IOException| NumberFormatException| NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        Collections.sort(arr);
        System.out.println("Sorted list in the range [1;100] : "+ arr);

    }

}
