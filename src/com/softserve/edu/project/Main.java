package com.softserve.edu.project;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flat Flat1 = new Flat(99,0,365,0,0,0,0.1,10,5,15);
        Flat1.get_props();
        Scanner sc = new Scanner(System.in);
        boolean n = true;
        while (n) {
            int m;
            m = sc.nextInt();
            System.out.println("-----------------------------------------------------");
            switch (m) {
                case 1:
                    Flat1.Stats();
                    System.out.println("Оновнелі дані: ");
                    Flat1.get_props();
                    break;
                case 2:
                    Flat1.Prices();
                    break;
                case 3:
                    Flat1.addRes();
                    System.out.println("Оновнелі дані: ");
                    Flat1.get_props();
                    break;
                case 4:
                   // Flat1.
                    System.out.println("Оновнелі дані: ");
                    Flat1.get_props();
                    break;
                case 5:
                    System.out.println("Кількість днів : ");
                    int days;
                    days = sc.nextInt();
                    Flat1.live(days);
                    System.out.println("Оновнелі дані: ");
                    Flat1.get_props();
                    break;
            }
        }
    }
}
