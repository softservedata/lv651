package com.OOP.ClassObject;

public class hmW02 {
    public static void main(String[] args) {
        Person p0 = new Person("Vl", "Hah");
        Person p1 = new Person("AA", " BB");
        Person p2 = new Person("AA", " BB");
        Person p3 = new Person("AA", " BB");
        Person p4 = new Person("AA", " BB");
        p0.output();
        p4.output();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        p0.input();
        p1.input();
        p2.input();
        p3.input();
        p4.input();
        p0.getAge();
        p1.getAge();
        p2.getAge();
        p3.getAge();
        p4.getAge();
        p0.output();
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        p0.changeName();
        p0.output();
    }
}
