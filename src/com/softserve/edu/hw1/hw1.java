package com.softserve.edu.hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hw1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //task 1
        //Perimeter
        System.out.println("Please enter radius");
        double radius = Double.parseDouble(br.readLine());
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter:" + perimeter);

        //Area
        double area = (int) Math.PI*radius*radius;
        System.out.println("Area:" + area);

        //task 2
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where do you live," + name + "?");
        String address = br.readLine();
        System.out.println("Your name is " + name + " and you live in " + address);

        //task 3
        //Input Standart
        System.out.println("Please input c1 standart units per minute:");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Please input c2 standart units per minute:");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Please input c3 standart units per minute:");
        double c3 = Double.parseDouble(br.readLine());

        //Input call continued
        System.out.println("Please input how much time talk continued (in minutes) t1 :");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Please input how much time talk continued (in minutes) t2:");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Please input how much time talk continued (in minutes) t3:");
        int t3 = Integer.parseInt(br.readLine());

        //Call results
        double call1 = c1*t1;
        System.out.println("Result call 1: " + call1);
        double call2 = c2*t2;
        System.out.println("Result call 2: " + call2);
        double call3 = c3*t3;
        System.out.println("Result call 3: " + call3);

        //Final result
        System.out.println("Final results: " + (call1+call2+call3));
    }
}
