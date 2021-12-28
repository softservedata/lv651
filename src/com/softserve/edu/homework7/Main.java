package com.softserve.edu.homework7;

public class Main {
    public static void main(String[] args) {
        FullName f1 = new Student(new Person() {
            @Override
            public String activity() {
                return null;
            }
        },1);
        f1.setFirstName("Taras");
        f1.setLastName("Kamula");
        ((Person)f1).setAge(18);
        System.out.println(f1);

        FullName f2 = new Student(new Person() {
            @Override
            public String activity() {
                return null;
            }
        },2);
        f2.setFirstName("Olga");
        f2.setLastName("Frolova");
        ((Person)f1).setAge(20);
        System.out.println(f2);

        System.out.println(((Person) f1).info());
        System.out.println(((Person) f1).activity());
        System.out.println(((Person) f2).info());
        System.out.println(((Person) f2).activity());

    }
}
