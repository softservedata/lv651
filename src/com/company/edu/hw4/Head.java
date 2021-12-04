package com.company.edu.hw4;
import java.util.Scanner;
public class Head {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //task 1
        float a, b, c;
        System.out.println("Input numbers:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if(-5<=a && a<=5 && -5<=b && b<=5 && -5<=c && c<=5){
            System.out.println("All of the numbers belong to the range [-5;5]");
        }
        else
            System.out.println("Not all of the numbers belong to the range [-5;5]");
       //Task 2

       int d, e,f;

        System.out.println("Input numbers:");
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        int min=d, max=d;
        if(e>d && e>f){
            max=e;
        }
        else if(f>d && f>e){
            max=f;
        }
        else if(d>f && d>e) {
            max = d;
        }
        if(e<d && e<f){
            min=e;
        }
        else if(f<d && f<e){
            min=f;
        }
        else if(d<f && d<e) {
            min = d;
        }
        System.out.println("Max value:"+max+" Min value:"+min);
        //task 3

        HTTPErrors errr;
        errr=HTTPErrors.CONFLICT;
        System.out.println("Error name "+errr.errorName(401).name());

        // Task 4

        Dog dog1 = new Dog("Jack", 6, "Jackrussel");
        Dog dog2 = new Dog("Zenyk", 7);
        Dog dog3 = new Dog ("Benya", 13, "Sibainu");
        if (dog1.equals(dog2) && dog1.equals(dog3)){
            System.out.println("The name of all dogs is "+dog1.getName());
        }
        else if(dog1.equals(dog2)|| dog1.equals(dog3) )
            System.out.println("There are two dogs named "+dog1.getName());
        else if(dog2.equals(dog3))
            System.out.println("There are two dogs named "+dog2.getName());
        else if (!(dog1.equals(dog2)|| dog1.equals(dog3) || dog2.equals(dog3))) {
            System.out.println("There are different dogs");
        }
        if(dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()){
            System.out.println(dog1.getName()+" "+dog1.getBreed()+" is the oldest");
        }
        else if(dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()){
            System.out.println(dog2.getName()+" "+dog2.getBreed()+" is the oldest");
        }
        else if(dog3.getAge()>dog2.getAge() && dog3.getAge()>dog1.getAge()){
            System.out.println(dog3.getName()+" "+dog3.getBreed()+" is the oldest");
        }
        else if(dog1.getAge()>dog3.getAge() && dog1.getAge()== dog2.getAge()){
            System.out.println(dog1.getName()+" "+dog1.getBreed()+" is the oldest\nand\n"+dog2.getName()+" "+dog2.getBreed()+" is the oldest");
        }
        else if(dog2.getAge()>dog1.getAge() && dog2.getAge()== dog3.getAge()){
            System.out.println(dog2.getName()+" "+dog2.getBreed()+" is the oldest\nand\n"+dog3.getName()+" "+dog3.getBreed()+" is the oldest");
        }
        else if(dog3.getAge()>dog2.getAge() && dog1.getAge()== dog3.getAge()){
            System.out.println(dog3.getName()+" "+dog3.getBreed()+" is the oldest\nand\n"+dog1.getName()+" "+dog1.getBreed()+" is the oldest");
        }
        else if(dog1.getAge()== dog2.getAge() && dog2.getAge()==dog3.getAge()){
            System.out.println(dog1.getName()+" "+dog1.getBreed()+" is the oldest\nand\n"+dog2.getName()+" "+dog2.getBreed()+" is the oldest\nand\n"+dog3.getName()+" "+dog3.getBreed()+" is the oldest");
        }
    }

}
