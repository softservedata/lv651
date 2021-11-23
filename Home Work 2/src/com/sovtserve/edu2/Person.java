package com.sovtserve.edu2;
import java.util.Scanner;
public class Person {
    private String Firstname;
    private String Lastname;
    private int Birthjear;

    public Person() {
    }

    public Person(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;

    }

    public int getAge() {
        int age = 2021 - Birthjear;
        return age;

    }


    Scanner a = new Scanner(System.in);

    public void input() {

        System.out.println("Input First-Lastname:");
        String name = a.next(), lastname = a.next();

        this.Firstname = name;
        this.Lastname = lastname;
        System.out.println("Input birtfhYear:");
        int by = a.nextInt();
        this.Birthjear = by;
    }

    public void output() {
        System.out.println("First name:" + Firstname);
        System.out.println("Last name:" + Lastname);
        System.out.println("Year of birth:" + Birthjear);
    }


    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Mazepa");
        Person person2 = new Person();
        Person person3 = new Person("Petvro", "Hohol");
        Person person4 = new Person();
        Person person5 = new Person("Andriy", "Moskal");
        person2.input();
        person1.output();
        person1.getAge();
        person4.input();
        person4.getAge();
        person3.input();
        person5.output();
    }
}



