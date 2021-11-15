package com.company01;

import java.util.Scanner;

public class HomeW01MathTest {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int a;
        int b;
        int c;
        double d;
        double r;
        double t;
        Scanner s = new Scanner(System.in);
        System.out.println("Напишіть два числа, які потрібно додати: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Ви написали: "+a+"+"+b+" Результат: "+c);

        System.out.println("Напишіть два числа, які потрібно відняти: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a - b;
        System.out.println("Ви написали: "+a+"-"+b+" Результат: "+c);

        System.out.println("Напишіть два числа, які потрібно помножити: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a*b;
        System.out.println("Ви написали: "+a+"*"+b+" Результат: "+c);

        System.out.println("Напишіть два числа, які потрібно розділити: ");
        r = s.nextInt();
        t = s.nextInt();
        d = r/t;
        System.out.println("Ви написали: "+r+"/"+t+" Результат: "+d);
        s.close();

    }
}
