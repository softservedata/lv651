package com.softserve.edu.hw11;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11{

    public static double div() {

        try {
            System.out.println("Enter first double number: ");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            System.out.println("Enter second double number");
            double b = scanner.nextDouble();

            return a/b;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        }catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            return 0;
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException: "+ e.getMessage());
            return 0;
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }


   public static int readNumber(int start, int end) {
       Scanner sc = new Scanner(System.in);
       try {
           int a = sc.nextInt();
           if (a <= start || a >= end)
               throw new Exception("Number does not fit");
           return a;
       } catch (NumberFormatException e) {
           System.out.println("NumberFormatException " + e.getMessage());
           return 0;
       } catch (NullPointerException e) {
           System.out.println("NullPointerException " + e.getMessage());
           return 0;
       } catch (Exception e) {
           e.printStackTrace();
           return 0;
       }
   }


    public static void main(String[] args) {
        System.out.println(div());

        System.out.println("---------------------------------");
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 1 number:");
        numbers.add(readNumber(1, 100));
        for(int i=0; i<9; i++){
            System.out.println("Enter "+(i+2)+" number:");
            numbers.add(readNumber(numbers.get(i), 100));
        }
        System.out.print("Output:\n 1<");
        for(int i=0; i< numbers.size(); i++){
            System.out.print(numbers.get(i)+"<");
        }
        System.out.println("100");
    }
    }


