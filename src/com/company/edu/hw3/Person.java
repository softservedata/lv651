package com.company.edu.hw3;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);

    public int getBirthYear() {
        return birthYear;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    private int birthYear;


    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int age = 2021 - birthYear;
        return age;
    }

    public void input() {
if(firstName==""&&lastName=="") {
    System.out.println("Input info:");
    String name = sc.next(), surname = sc.next();

    this.firstName = name;
    this.lastName = surname;
}
        System.out.println("Input birthYear:");
        int by = sc.nextInt();
        this.birthYear = by;

    }

    public void output() {
        System.out.println("First name:" + firstName);
        System.out.println("Last name:" + lastName);
        System.out.println("Year of birth:" + birthYear);
    }

    public void changeName(String fn, String ln) {
        Boolean m = true;

        while (m) {
            System.out.println("To change first name, press 1\n"
                    +"To change last name, press 2\n"
                    +"To change first name and last name, press 3");
            int n;
            n=sc.nextInt();
            switch(n){
                case 1:
                    if(firstName!="") {
                    System.out.println("Your first name:" + getFirstName());
                    System.out.println("Enter new first name:");
                    fn = sc.next();
                    this.firstName=fn;
                }
                else{
                    System.out.println("Enter your first name:");
                    fn = sc.next();
                    this.firstName=fn;}
                    break;
                case 2:
                    if(lastName!="") {
                        System.out.println("Your last name:" + getLastName());
                        System.out.println("Enter new last name:");
                        ln = sc.next();
                        this.lastName = ln;
                    }
                    else{
                    System.out.println("Enter your last name:");
                    ln = sc.next();
                    this.lastName = ln;}
                    break;
                case 3:
                    if(firstName!=""&&lastName!="") {
                        System.out.println("Your first Name:" + getFirstName());
                        System.out.println("Your last name:" + getLastName());
                        System.out.println("Enter new first name:");
                        fn = sc.next();
                        this.firstName = fn;

                        System.out.println("Enter new last name:");
                        ln = sc.next();
                        this.lastName = ln;
                    }
                    else{
                        System.out.println("Enter your first name:");
                    fn = sc.next();
                    this.firstName=fn;
                    System.out.println("Enter your last name:");
                    ln = sc.next();
                    this.lastName = ln; }
                    break;

                case 4:
                    m=false;
                    break;

            }
    }


}
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivan", "Ivanov");
        Person person3 = new Person("Petro", "Petrenko");
        Person person4 = new Person();
        Person person5 = new Person("Vova", "Vovenko");
        person1.input();
        person2.input();
        person2.getAge();
        person3.input();
        person3.getAge();
        person4.input();
        person4.changeName(person1.getFirstName(), person1.getLastName());
        person5.input();
    }
}
