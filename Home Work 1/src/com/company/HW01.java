package com.company;
import java.util.Scanner;

public class HW01{
    double pi= 3.14159;


    public static void main(String[] args)

    {
        System.out.print("a=");
        Scanner aa = new Scanner(System.in);
        int a= aa.nextInt();
        System.out.print("b=");
        Scanner bb = new Scanner(System.in);
        int b=bb.nextInt();

        int c=a+b;
        int d=a-b;
        int e=a*b;
        float f=(float)a/b;

        System. out. println("a+b="+ c);
        System. out. println("a-b="+ d);
        System. out. println("a*b="+ e);
        System. out. println("a/b="+ f);
        HW01 app= new HW01();
        System. out. print("Radius=");
        Scanner Rr= new Scanner(System.in);
        float R= Rr.nextFloat();
        System.out.println("S="+ (app.pi *(R*R)));
        System.out.println("P="+ (2* app.pi *R));
        //
        System.out.print("What is your name?");
        Scanner name= new Scanner(System.in);
        String n =name.nextLine();
        System.out.println(" Your name's is \t" + n);
        System.out.println("Where are you live \t"+ n+"?");
        Scanner live= new Scanner(System.in);
        String l =live.nextLine();
        System.out.print("you live are \t"+l);

    }


}
