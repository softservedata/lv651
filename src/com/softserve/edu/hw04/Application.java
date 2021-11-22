package com.softserve.edu.hw04;

public class Application {
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.input(1);
        myPerson.changeName("New", "New");
        System.out.println("My age is: " + myPerson.getAge());
        myPerson.output();

        Person myPerson2 = new Person();
        myPerson2.input(2);
        myPerson2.changeName("New2", "New2");
        System.out.println("My age is: " + myPerson2.getAge());
        myPerson2.output();

        Person myPerson3 = new Person();
        myPerson3.input(3);
        myPerson3.changeName("New3", "New3");
        System.out.println("My age is: " + myPerson3.getAge());
        myPerson3.output();

        Person myPerson4 = new Person();
        myPerson4.input(4);
        myPerson3.changeName("New4", "New4");
        System.out.println("My age is: " + myPerson4.getAge());
        myPerson4.output();

        Person myPerson5 = new Person();
        myPerson5.input(5);
        myPerson5.changeName("New5", "New5");
        System.out.println("My age is: " + myPerson5.getAge());
        myPerson3.output();


    }
}