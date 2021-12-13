package com.company.edu.hw01;
import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a,b;
            System.out.println("Enter a:");
            a=sc.nextInt();
            System.out.println("Enter b:");
            b=sc.nextInt();

            System.out.println("a="+a+", b="+b);
            System.out.println("a+b="+(a+b));
            System.out.println("a-b="+(a-b));
            System.out.println("a*b="+(a*b));
            System.out.println("a/b="+(a/b));
            System.out.println("How old are you?");
            String answer = sc.next();
            System.out.println("You are "+answer);
            float pi =3.14f;
            float r = sc.nextFloat();
            System.out.println("Enter r:");
            System.out.println("Perimeter of your flower bed="+(2*pi*r));
            System.out.println("Area of your flower bed="+(pi*r*r));

            float c1 = 3, c2 = 2.8f, c3 = 5.4f, t1, t2, t3;
            System.out.println("Enter amount of time of call 1:");
            t1 = sc.nextFloat();
            System.out.println("Enter amount of time of call 2:");
            t2 = sc.nextFloat();
            System.out.println("Enter amount of time of call 3:");
            t3 = sc.nextFloat();
            float p1 = t1 * c1, p2 = t2 * c2, p3 = t3 * c3;
            System.out.println("Enter 1 for viewing cost of call 1\n" +
                    "Enter 2 for viewing cost of call 2\n" +
                    "Enter 3 for viewing cost of call 3\n" +
                    "Enter 4 for viewing total cost\n" +
                    "Enter 5 t0 stop");
            boolean m = true;
            while (m) {
                int n;
                n=sc.nextInt();
 switch(n){
     case 1:
         System.out.println("Cost of call 1:"+p1+"$");
         break;
     case 2:
         System.out.println("Cost of call 2:"+p2+"$");
         break;
     case 3:
         System.out.println("Cost of call 3:"+p3+"$");
         break;
     case 4:
         System.out.println("Total cost:"+(p1+p2+p3)+"$");
         break;
     case 5:
         m=false;
         break;

 }
            }
        }
    }

